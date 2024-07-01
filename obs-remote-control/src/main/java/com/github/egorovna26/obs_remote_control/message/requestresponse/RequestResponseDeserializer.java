package com.github.egorovna26.obs_remote_control.message.requestresponse;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.egorovna26.obs_remote_control.message.request.RequestType;
import lombok.CustomLog;

import java.io.IOException;

@CustomLog
public class RequestResponseDeserializer extends StdDeserializer<RequestResponse> {
    public RequestResponseDeserializer() {
        this(null);
    }

    public RequestResponseDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public RequestResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        try {
            JsonNode json = jsonParser.getCodec().readTree(jsonParser);
            if (json.has("d")) {
                JsonNode node = json.get("d");
                if (node.has("requestType")) {
                    String type = node.get("requestType").asText();
                    RequestType requestType = RequestType.find(type);
                    if (requestType != null) {
                        JavaType javaType = deserializationContext.getTypeFactory().constructType(requestType.getResponseClass());
                        JsonDeserializer<Object> deserializer = deserializationContext.findRootValueDeserializer(javaType);
                        JsonParser parser = json.traverse(jsonParser.getCodec());
                        parser.nextToken();
                        return (RequestResponse) deserializer.deserialize(parser, deserializationContext);
                    }
                }
            }
        } catch (Exception e) {
            log.error("Error deserializing request response", e);
        }
        return null;
    }
}
