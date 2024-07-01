package com.github.egorovna26.obs_remote_control.message.hello;

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
public class Hello extends Message {
    @JsonProperty(value = "d")
    private Data data;

    public String getObsWebSocketVersion() {
        return getData().getObsWebSocketVersion();
    }

    public int getRpcVersion() {
        return getData().getRpcVersion();
    }

    public boolean authenticationRequired() {
        return getData().getAuthentication() != null;
    }

    public String getChallenge() {
        return getData().getAuthentication().getChallenge();
    }

    public String getSalt() {
        return getData().getAuthentication().getSalt();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(callSuper = true)
    public static class Data implements Serializable {
        @JsonProperty(value = "obsWebSocketVersion")
        private String obsWebSocketVersion;
        @JsonProperty(value = "rpcVersion")
        private int rpcVersion;
        @JsonProperty(value = "authentication")
        private Authentication authentication;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Setter
        @ToString(callSuper = true)
        public static class Authentication implements Serializable {
            @JsonProperty(value = "challenge")
            private String challenge;
            @JsonProperty(value = "salt")
            private String salt;
        }
    }
}
