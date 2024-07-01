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
 * Gets the transform and crop info of a scene item.
 *
 * Scenes and Groups
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemTransformResponse extends RequestResponse<GetSceneItemTransformResponse.Data> {
    /**
     * @return Object containing scene item transform info
     */
    public Object getSceneItemTransform() {
        return getData().getResponseData().getSceneItemTransform();
    }

    /**
     * GetSceneItemTransform Request Response Data
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
         * Object containing scene item transform info
         */
        @JsonProperty("sceneItemTransform")
        private Object sceneItemTransform;
    }
}
