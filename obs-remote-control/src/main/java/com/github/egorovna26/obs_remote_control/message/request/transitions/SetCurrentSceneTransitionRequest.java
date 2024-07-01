package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the current scene transition.
 *
 * Small note: While the namespace of scene transitions is generally unique, that uniqueness is not a guarantee as it is with other resources like inputs.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentSceneTransitionRequest extends Request<SetCurrentSceneTransitionRequest.Data> {
    /**
     * SetCurrentSceneTransitionRequest constructor
     */
    public SetCurrentSceneTransitionRequest(String transitionName) {
        super("SetCurrentSceneTransition", new Data(transitionName));
    }

    /**
     * SetCurrentSceneTransition Request Data
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
         * Name of the transition to make active
         */
        @JsonProperty("transitionName")
        private String transitionName;
    }
}
