package com.github.egorovna26.obs_remote_control.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.egorovna26.obs_remote_control.message.Message;
import com.github.egorovna26.obs_remote_control.message.MessageDeserializer;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import com.github.egorovna26.obs_remote_control.message.event.EventDeserializer;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponseDeserializer;
import lombok.CustomLog;
import lombok.experimental.UtilityClass;

@UtilityClass
@CustomLog
public class JsonUtil {
    public static String toJson(Object obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            log.error("toJson error", e);
        }
        return "";
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            SimpleModule module = new SimpleModule();
            module.addDeserializer(Message.class, new MessageDeserializer());
            module.addDeserializer(Event.class, new EventDeserializer());
            module.addDeserializer(RequestResponse.class, new RequestResponseDeserializer());
            mapper.registerModule(module);
            return mapper.readValue(json, clazz);
        } catch (Exception e) {
            log.error("fromJson error", e);
        }
        return null;
    }
}
