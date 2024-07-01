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
 * Sets the name of a scene (rename).
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetSceneNameRequest extends Request<SetSceneNameRequest.Data> {
    /**
     * SetSceneNameRequest constructor
     */
    public SetSceneNameRequest(String sceneName, String sceneUuid, String newSceneName) {
        super("SetSceneName", new Data(sceneName, sceneUuid, newSceneName));
    }

    /**
     * SetSceneName Request Data
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
         * Name of the scene to be renamed
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the scene to be renamed
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * New name for the scene
         */
        @JsonProperty("newSceneName")
        private String newSceneName;
    }
}
