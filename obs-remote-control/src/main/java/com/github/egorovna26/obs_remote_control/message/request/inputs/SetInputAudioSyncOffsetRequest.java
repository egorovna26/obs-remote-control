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
 * Sets the audio sync offset of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputAudioSyncOffsetRequest extends Request<SetInputAudioSyncOffsetRequest.Data> {
    /**
     * SetInputAudioSyncOffsetRequest constructor
     */
    public SetInputAudioSyncOffsetRequest(String inputName, String inputUuid,
            int inputAudioSyncOffset) {
        super("SetInputAudioSyncOffset", new Data(inputName, inputUuid, inputAudioSyncOffset));
    }

    /**
     * SetInputAudioSyncOffset Request Data
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
         * Name of the input to set the audio sync offset of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to set the audio sync offset of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * New audio sync offset in milliseconds
         */
        @JsonProperty("inputAudioSyncOffset")
        private int inputAudioSyncOffset;
    }
}
