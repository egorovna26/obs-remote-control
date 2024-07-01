package com.github.egorovna26.obs_remote_control.message.event.transitions;

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
 * A scene transition's video has completed fully.
 *
 * Useful for stinger transitions to tell when the video *actually* ends.
 * `SceneTransitionEnded` only signifies the cut point, not the completion of transition playback.
 *
 * Note: Appears to be called by every transition, regardless of relevance.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneTransitionVideoEnded extends Event<SceneTransitionVideoEnded.Data> {
    /**
     * @return Scene transition name
     */
    public String getTransitionName() {
        return getData().getEventData().getTransitionName();
    }

    /**
     * @return Scene transition UUID
     */
    public String getTransitionUuid() {
        return getData().getEventData().getTransitionUuid();
    }

    /**
     * SceneTransitionVideoEnded Event Data
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
         * Scene transition name
         */
        @JsonProperty("transitionName")
        private String transitionName;

        /**
         * Scene transition UUID
         */
        @JsonProperty("transitionUuid")
        private String transitionUuid;
    }
}
