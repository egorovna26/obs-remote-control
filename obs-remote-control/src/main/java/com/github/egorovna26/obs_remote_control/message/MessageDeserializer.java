package com.github.egorovna26.obs_remote_control.message;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import lombok.CustomLog;

@CustomLog
public class MessageDeserializer extends StdDeserializer<Message> {
    public MessageDeserializer() {
        this(null);
    }

    public MessageDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Message deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
            if (jsonNode.has("op")) {
                int op = jsonNode.get("op").asInt();
                OpCode opCode = OpCode.find(op);
                if (opCode != null) {
                    JavaType javaType = deserializationContext.getTypeFactory().constructType(opCode.getMessageClass());
                    JsonDeserializer<Object> deserializer = deserializationContext.findRootValueDeserializer(javaType);
                    JsonParser parser = jsonNode.traverse(jsonParser.getCodec());
                    parser.nextToken();
                    return (Message) deserializer.deserialize(parser, deserializationContext);
                }
            }
        } catch (Exception e) {
            log.error("Error deserializing message", e);
        }
        return null;
    }
}
