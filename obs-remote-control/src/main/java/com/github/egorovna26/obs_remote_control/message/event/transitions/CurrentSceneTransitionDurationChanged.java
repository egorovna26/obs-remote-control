package com.github.egorovna26.obs_remote_control.message.event.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The current scene transition duration has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentSceneTransitionDurationChanged extends Event<CurrentSceneTransitionDurationChanged.Data> {
    /**
     * @return Transition duration in milliseconds
     */
    public int getTransitionDuration() {
        return getData().getEventData().getTransitionDuration();
    }

    /**
     * CurrentSceneTransitionDurationChanged Event Data
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
         * Transition duration in milliseconds
         */
        @JsonProperty("transitionDuration")
        private int transitionDuration;
    }
}
