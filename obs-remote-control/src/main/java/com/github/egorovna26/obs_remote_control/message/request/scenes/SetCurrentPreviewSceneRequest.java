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
 * Sets the current preview scene.
 *
 * Only available when studio mode is enabled.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentPreviewSceneRequest extends Request<SetCurrentPreviewSceneRequest.Data> {
    /**
     * SetCurrentPreviewSceneRequest constructor
     */
    public SetCurrentPreviewSceneRequest(String sceneName, String sceneUuid) {
        super("SetCurrentPreviewScene", new Data(sceneName, sceneUuid));
    }

    /**
     * SetCurrentPreviewScene Request Data
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
         * Scene name to set as the current preview scene
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * Scene UUID to set as the current preview scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;
    }
}
