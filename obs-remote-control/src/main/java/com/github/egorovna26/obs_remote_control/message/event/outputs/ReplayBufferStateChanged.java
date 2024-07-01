package com.github.egorovna26.obs_remote_control.message.event.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The state of the replay buffer output has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ReplayBufferStateChanged extends Event<ReplayBufferStateChanged.Data> {
    /**
     * @return Whether the output is active
     */
    public boolean isOutputActive() {
        return getData().getEventData().isOutputActive();
    }

    /**
     * @return The specific state of the output
     */
    public String getOutputState() {
        return getData().getEventData().getOutputState();
    }

    /**
     * ReplayBufferStateChanged Event Data
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

        /**
         * The specific state of the output
         */
        @JsonProperty("outputState")
        private String outputState;
    }
}
