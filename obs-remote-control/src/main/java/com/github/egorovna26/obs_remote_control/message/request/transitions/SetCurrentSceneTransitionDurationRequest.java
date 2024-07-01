package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the duration of the current scene transition, if it is not fixed.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentSceneTransitionDurationRequest extends Request<SetCurrentSceneTransitionDurationRequest.Data> {
    /**
     * SetCurrentSceneTransitionDurationRequest constructor
     */
    public SetCurrentSceneTransitionDurationRequest(int transitionDuration) {
        super("SetCurrentSceneTransitionDuration", new Data(transitionDuration));
    }

    /**
     * SetCurrentSceneTransitionDuration Request Data
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
         * Duration in milliseconds
         */
        @JsonProperty("transitionDuration")
        private int transitionDuration;
    }
}
