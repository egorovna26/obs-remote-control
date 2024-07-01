package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the enable state of audio tracks of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputAudioTracksRequest extends Request<SetInputAudioTracksRequest.Data> {
    /**
     * SetInputAudioTracksRequest constructor
     */
    public SetInputAudioTracksRequest(String inputName, String inputUuid, Object inputAudioTracks) {
        super("SetInputAudioTracks", new Data(inputName, inputUuid, inputAudioTracks));
    }

    /**
     * SetInputAudioTracks Request Data
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
         * Name of the input
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Track settings to apply
         */
        @JsonProperty("inputAudioTracks")
        private Object inputAudioTracks;
    }
}
