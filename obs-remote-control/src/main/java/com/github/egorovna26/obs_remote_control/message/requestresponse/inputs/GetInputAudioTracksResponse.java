package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the enable state of all audio tracks of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioTracksResponse extends RequestResponse<GetInputAudioTracksResponse.Data> {
    /**
     * @return Object of audio tracks and associated enable states
     */
    public Object getInputAudioTracks() {
        return getData().getResponseData().getInputAudioTracks();
    }

    /**
     * GetInputAudioTracks Request Response Data
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
         * Object of audio tracks and associated enable states
         */
        @JsonProperty("inputAudioTracks")
        private Object inputAudioTracks;
    }
}
