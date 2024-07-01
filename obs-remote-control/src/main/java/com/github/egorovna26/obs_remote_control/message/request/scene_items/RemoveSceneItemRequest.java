package com.github.egorovna26.obs_remote_control.message.request.scene_items;

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
 * Removes a scene item from a scene.
 *
 * Scenes only
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RemoveSceneItemRequest extends Request<RemoveSceneItemRequest.Data> {
    /**
     * RemoveSceneItemRequest constructor
     */
    public RemoveSceneItemRequest(String sceneName, String sceneUuid, int sceneItemId) {
        super("RemoveSceneItem", new Data(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * RemoveSceneItem Request Data
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
         * Name of the scene the item is in
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the scene the item is in
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Numeric ID of the scene item
         */
        @JsonProperty("sceneItemId")
        private int sceneItemId;
    }
}
