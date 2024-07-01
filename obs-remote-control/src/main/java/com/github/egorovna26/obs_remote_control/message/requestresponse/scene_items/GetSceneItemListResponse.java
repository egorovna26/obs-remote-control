package com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets a list of all scene items in a scene.
 *
 * Scenes only
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemListResponse extends RequestResponse<GetSceneItemListResponse.Data> {
    /**
     * @return Array of scene items in the scene
     */
    public Object getSceneItems() {
        return getData().getResponseData().getSceneItems();
    }

    /**
     * GetSceneItemList Request Response Data
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
         * Array of scene items in the scene
         */
        @JsonProperty("sceneItems")
        private Object sceneItems;
    }
}
