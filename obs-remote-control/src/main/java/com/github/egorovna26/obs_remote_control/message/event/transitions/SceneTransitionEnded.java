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
 * A scene transition has completed fully.
 *
 * Note: Does not appear to trigger when the transition is interrupted by the user.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneTransitionEnded extends Event<SceneTransitionEnded.Data> {
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
     * SceneTransitionEnded Event Data
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
