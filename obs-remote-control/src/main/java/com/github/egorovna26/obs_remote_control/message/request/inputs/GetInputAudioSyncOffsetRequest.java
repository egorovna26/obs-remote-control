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
 * Gets the audio sync offset of an input.
 *
 * Note: The audio sync offset can be negative too!
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioSyncOffsetRequest extends Request<GetInputAudioSyncOffsetRequest.Data> {
    /**
     * GetInputAudioSyncOffsetRequest constructor
     */
    public GetInputAudioSyncOffsetRequest(String inputName, String inputUuid) {
        super("GetInputAudioSyncOffset", new Data(inputName, inputUuid));
    }

    /**
     * GetInputAudioSyncOffset Request Data
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
         * Name of the input to get the audio sync offset of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to get the audio sync offset of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
