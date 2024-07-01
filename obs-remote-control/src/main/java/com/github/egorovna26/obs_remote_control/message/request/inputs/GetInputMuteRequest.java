package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the audio mute state of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputMuteRequest extends Request<GetInputMuteRequest.Data> {
    /**
     * GetInputMuteRequest constructor
     */
    public GetInputMuteRequest(String inputName, String inputUuid) {
        super("GetInputMute", new Data(inputName, inputUuid));
    }

    /**
     * GetInputMute Request Data
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(
            callSuper = true
    )
    public static class Data implements Serializable {
        /**
         * Name of input to get the mute state of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of input to get the mute state of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
