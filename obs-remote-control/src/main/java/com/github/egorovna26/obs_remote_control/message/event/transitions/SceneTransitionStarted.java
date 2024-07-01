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
 * A scene transition has started.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneTransitionStarted extends Event<SceneTransitionStarted.Data> {
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
     * SceneTransitionStarted Event Data
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
