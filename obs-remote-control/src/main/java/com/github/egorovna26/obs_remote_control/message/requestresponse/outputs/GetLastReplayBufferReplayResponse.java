package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the filename of the last replay buffer save file.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetLastReplayBufferReplayResponse extends RequestResponse<GetLastReplayBufferReplayResponse.Data> {
    /**
     * @return File path
     */
    public String getSavedReplayPath() {
        return getData().getResponseData().getSavedReplayPath();
    }

    /**
     * GetLastReplayBufferReplay Request Response Data
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
         * File path
         */
        @JsonProperty("savedReplayPath")
        private String savedReplayPath;
    }
}
