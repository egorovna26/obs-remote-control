package com.github.egorovna26.obs_remote_control.message.requestresponse.scenes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current preview scene.
 *
 * Only available when studio mode is enabled.
 *
 * Note: This request is slated to have the `currentPreview`-prefixed fields removed from in an upcoming RPC version.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetCurrentPreviewSceneResponse extends RequestResponse<GetCurrentPreviewSceneResponse.Data> {
    /**
     * @return Current preview scene name
     */
    public String getSceneName() {
        return getData().getResponseData().getSceneName();
    }

    /**
     * @return Current preview scene UUID
     */
    public String getSceneUuid() {
        return getData().getResponseData().getSceneUuid();
    }

    /**
     * @return Current preview scene name
     */
    public String getCurrentPreviewSceneName() {
        return getData().getResponseData().getCurrentPreviewSceneName();
    }

    /**
     * @return Current preview scene UUID
     */
    public String getCurrentPreviewSceneUuid() {
        return getData().getResponseData().getCurrentPreviewSceneUuid();
    }

    /**
     * GetCurrentPreviewScene Request Response Data
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
         * Current preview scene name
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * Current preview scene UUID
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Current preview scene name
         */
        @JsonProperty("currentPreviewSceneName")
        private String currentPreviewSceneName;

        /**
         * Current preview scene UUID
         */
        @JsonProperty("currentPreviewSceneUuid")
        private String currentPreviewSceneUuid;
    }
}
