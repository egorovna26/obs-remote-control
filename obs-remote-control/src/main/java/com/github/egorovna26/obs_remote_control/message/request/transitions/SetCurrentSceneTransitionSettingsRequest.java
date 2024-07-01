package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the settings of the current scene transition.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentSceneTransitionSettingsRequest extends Request<SetCurrentSceneTransitionSettingsRequest.Data> {
    /**
     * SetCurrentSceneTransitionSettingsRequest constructor
     */
    public SetCurrentSceneTransitionSettingsRequest(Object transitionSettings, boolean overlay) {
        super("SetCurrentSceneTransitionSettings", new Data(transitionSettings, overlay));
    }

    /**
     * SetCurrentSceneTransitionSettings Request Data
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
         * Settings object to apply to the transition. Can be `{}`
         */
        @JsonProperty("transitionSettings")
        private Object transitionSettings;

        /**
         * Whether to overlay over the current settings or replace them
         */
        @JsonProperty("overlay")
        private boolean overlay;
    }
}
