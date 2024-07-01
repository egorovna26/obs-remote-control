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
 * The replay buffer has been saved.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ReplayBufferSaved extends Event<ReplayBufferSaved.Data> {
    /**
     * @return Path of the saved replay file
     */
    public String getSavedReplayPath() {
        return getData().getEventData().getSavedReplayPath();
    }

    /**
     * ReplayBufferSaved Event Data
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
         * Path of the saved replay file
         */
        @JsonProperty("savedReplayPath")
        private String savedReplayPath;
    }
}
