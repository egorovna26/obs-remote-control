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
 * Duplicates a scene item, copying all transform and crop info.
 *
 * Scenes only
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class DuplicateSceneItemResponse extends RequestResponse<DuplicateSceneItemResponse.Data> {
    /**
     * @return Numeric ID of the duplicated scene item
     */
    public int getSceneItemId() {
        return getData().getResponseData().getSceneItemId();
    }

    /**
     * DuplicateSceneItem Request Response Data
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
         * Numeric ID of the duplicated scene item
         */
        @JsonProperty("sceneItemId")
        private int sceneItemId;
    }
}
