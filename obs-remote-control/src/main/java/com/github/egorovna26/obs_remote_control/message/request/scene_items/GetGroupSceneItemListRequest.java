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
 * Basically GetSceneItemList, but for groups.
 *
 * Using groups at all in OBS is discouraged, as they are very broken under the hood. Please use nested scenes instead.
 *
 * Groups only
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetGroupSceneItemListRequest extends Request<GetGroupSceneItemListRequest.Data> {
    /**
     * GetGroupSceneItemListRequest constructor
     */
    public GetGroupSceneItemListRequest(String sceneName, String sceneUuid) {
        super("GetGroupSceneItemList", new Data(sceneName, sceneUuid));
    }

    /**
     * GetGroupSceneItemList Request Data
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
         * Name of the group to get the items of
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the group to get the items of
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;
    }
}
