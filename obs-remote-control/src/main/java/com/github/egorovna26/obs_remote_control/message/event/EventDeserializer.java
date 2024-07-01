package com.github.egorovna26.obs_remote_control.message.event;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import lombok.CustomLog;

@CustomLog
public class EventDeserializer extends StdDeserializer<Event> {
    public EventDeserializer() {
        this(null);
    }

    public EventDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Event deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            JsonNode json = jsonParser.getCodec().readTree(jsonParser);
            if (json.has("d")) {
                JsonNode node = json.get("d");
                if (node.has("eventType")) {
                    String type = node.get("eventType").asText();
                    EventType eventType = EventType.find(type);
                    if (eventType != null) {
                        JavaType javaType = deserializationContext.getTypeFactory().constructType(eventType.getEventClass());
                        JsonDeserializer<Object> deserializer = deserializationContext.findRootValueDeserializer(javaType);
                        JsonParser parser = json.traverse(jsonParser.getCodec());
                        parser.nextToken();
                        return (Event) deserializer.deserialize(parser, deserializationContext);
                    }
                }
            }
        } catch (Exception e) {
            log.error("Error deserializing event", e);
        }
        return null;
    }
}
