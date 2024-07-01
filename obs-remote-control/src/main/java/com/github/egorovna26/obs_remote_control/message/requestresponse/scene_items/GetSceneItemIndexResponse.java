package com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the index position of a scene item in a scene.
 *
 * An index of 0 is at the bottom of the source list in the UI.
 *
 * Scenes and Groups
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemIndexResponse extends RequestResponse<GetSceneItemIndexResponse.Data> {
    /**
     * @return Index position of the scene item
     */
    public int getSceneItemIndex() {
        return getData().getResponseData().getSceneItemIndex();
    }

    /**
     * GetSceneItemIndex Request Response Data
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
         * Index position of the scene item
         */
        @JsonProperty("sceneItemIndex")
        private int sceneItemIndex;
    }
}
