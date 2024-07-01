package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
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
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioSyncOffsetResponse extends RequestResponse<GetInputAudioSyncOffsetResponse.Data> {
    /**
     * @return Audio sync offset in milliseconds
     */
    public int getInputAudioSyncOffset() {
        return getData().getResponseData().getInputAudioSyncOffset();
    }

    /**
     * GetInputAudioSyncOffset Request Response Data
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
         * Audio sync offset in milliseconds
         */
        @JsonProperty("inputAudioSyncOffset")
        private int inputAudioSyncOffset;
    }
}
