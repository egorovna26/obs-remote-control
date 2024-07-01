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
 * Sets the audio mute state of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputMuteRequest extends Request<SetInputMuteRequest.Data> {
    /**
     * SetInputMuteRequest constructor
     */
    public SetInputMuteRequest(String inputName, String inputUuid, boolean inputMuted) {
        super("SetInputMute", new Data(inputName, inputUuid, inputMuted));
    }

    /**
     * SetInputMute Request Data
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
         * Name of the input to set the mute state of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to set the mute state of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Whether to mute the input or not
         */
        @JsonProperty("inputMuted")
        private boolean inputMuted;
    }
}
