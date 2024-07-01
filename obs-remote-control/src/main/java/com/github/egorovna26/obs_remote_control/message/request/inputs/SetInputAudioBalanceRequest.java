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
 * Sets the audio balance of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputAudioBalanceRequest extends Request<SetInputAudioBalanceRequest.Data> {
    /**
     * SetInputAudioBalanceRequest constructor
     */
    public SetInputAudioBalanceRequest(String inputName, String inputUuid, int inputAudioBalance) {
        super("SetInputAudioBalance", new Data(inputName, inputUuid, inputAudioBalance));
    }

    /**
     * SetInputAudioBalance Request Data
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
         * Name of the input to set the audio balance of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to set the audio balance of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * New audio balance value
         */
        @JsonProperty("inputAudioBalance")
        private int inputAudioBalance;
    }
}
