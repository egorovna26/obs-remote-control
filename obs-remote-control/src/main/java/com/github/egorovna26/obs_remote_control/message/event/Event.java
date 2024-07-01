package com.github.egorovna26.obs_remote_control.message.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.Message;
import lombok.*;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public abstract class Event<T> extends Message {
    @JsonProperty(value = "d")
    private Data<T> data;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(callSuper = true)
    public static class Data<T> implements Serializable {
        @JsonProperty(value = "eventType")
        private String eventType;
        @JsonProperty(value = "eventIntent")
        private int eventIntent;
        @JsonProperty(value = "eventData")
        private T eventData;
    }
}
