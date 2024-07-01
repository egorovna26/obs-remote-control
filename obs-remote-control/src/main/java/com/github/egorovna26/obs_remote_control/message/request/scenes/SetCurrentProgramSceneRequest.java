package com.github.egorovna26.obs_remote_control.message.request.scenes;

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
 * Sets the current program scene.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentProgramSceneRequest extends Request<SetCurrentProgramSceneRequest.Data> {
    /**
     * SetCurrentProgramSceneRequest constructor
     */
    public SetCurrentProgramSceneRequest(String sceneName, String sceneUuid) {
        super("SetCurrentProgramScene", new Data(sceneName, sceneUuid));
    }

    /**
     * SetCurrentProgramScene Request Data
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
         * Scene name to set as the current program scene
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * Scene UUID to set as the current program scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;
    }
}
