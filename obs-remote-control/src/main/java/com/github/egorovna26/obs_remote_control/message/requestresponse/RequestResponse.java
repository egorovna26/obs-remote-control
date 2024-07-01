package com.github.egorovna26.obs_remote_control.message.requestresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.Message;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public abstract class RequestResponse<T> extends Message {
    @JsonProperty(value = "d")
    private Data<T> data;

    public String getRequestType() {
        return getData().getRequestType();
    }

    public UUID getRequestId() {
        return getData().getRequestId();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(callSuper = true)
    public static class Data<T> implements Serializable {
        @JsonProperty(value = "requestType")
        private String requestType;
        @JsonProperty(value = "requestId")
        private UUID requestId;
        @JsonProperty(value = "requestStatus")
        private RequestStatus requestStatus;
        @JsonProperty(value = "responseData")
        private T responseData;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Setter
        @ToString(callSuper = true)
        public static class RequestStatus implements Serializable {
            @JsonProperty(value = "result")
            private boolean result;
            @JsonProperty(value = "code")
            private int code;
            @JsonProperty(value = "comment")
            private String comment;
        }
    }
}
