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
 * Basically GetSceneItemList, but for groups.
 *
 * Using groups at all in OBS is discouraged, as they are very broken under the hood. Please use nested scenes instead.
 *
 * Groups only
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetGroupSceneItemListResponse extends RequestResponse<GetGroupSceneItemListResponse.Data> {
    /**
     * @return Array of scene items in the group
     */
    public Object getSceneItems() {
        return getData().getResponseData().getSceneItems();
    }

    /**
     * GetGroupSceneItemList Request Response Data
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
         * Array of scene items in the group
         */
        @JsonProperty("sceneItems")
        private Object sceneItems;
    }
}
