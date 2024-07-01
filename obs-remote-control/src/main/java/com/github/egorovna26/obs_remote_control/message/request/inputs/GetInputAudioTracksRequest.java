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
 * Gets the enable state of all audio tracks of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioTracksRequest extends Request<GetInputAudioTracksRequest.Data> {
    /**
     * GetInputAudioTracksRequest constructor
     */
    public GetInputAudioTracksRequest(String inputName, String inputUuid) {
        super("GetInputAudioTracks", new Data(inputName, inputUuid));
    }

    /**
     * GetInputAudioTracks Request Data
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
    }
}
