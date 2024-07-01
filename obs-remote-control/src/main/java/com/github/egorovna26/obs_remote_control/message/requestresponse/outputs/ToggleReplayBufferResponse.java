package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles the state of the replay buffer output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleReplayBufferResponse extends RequestResponse<ToggleReplayBufferResponse.Data> {
    /**
     * @return Whether the output is active
     */
    public boolean isOutputActive() {
        return getData().getResponseData().isOutputActive();
    }

    /**
     * ToggleReplayBuffer Request Response Data
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
         * Whether the output is active
         */
        @JsonProperty("outputActive")
        private boolean outputActive;
    }
}
