package com.github.egorovna26.obs_remote_control.message.identified;

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
public class Identified extends Message {
    @JsonProperty(value = "d")
    private Data data;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(callSuper = true)
    public static class Data implements Serializable {
        @JsonProperty(value = "negotiatedRpcVersion")
        private int negotiatedRpcVersion;
    }
}
