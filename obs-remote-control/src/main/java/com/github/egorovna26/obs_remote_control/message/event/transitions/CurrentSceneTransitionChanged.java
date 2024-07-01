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
 * The current scene transition has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentSceneTransitionChanged extends Event<CurrentSceneTransitionChanged.Data> {
    /**
     * @return Name of the new transition
     */
    public String getTransitionName() {
        return getData().getEventData().getTransitionName();
    }

    /**
     * @return UUID of the new transition
     */
    public String getTransitionUuid() {
        return getData().getEventData().getTransitionUuid();
    }

    /**
     * CurrentSceneTransitionChanged Event Data
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
         * Name of the new transition
         */
        @JsonProperty("transitionName")
        private String transitionName;

        /**
         * UUID of the new transition
         */
        @JsonProperty("transitionUuid")
        private String transitionUuid;
    }
}
