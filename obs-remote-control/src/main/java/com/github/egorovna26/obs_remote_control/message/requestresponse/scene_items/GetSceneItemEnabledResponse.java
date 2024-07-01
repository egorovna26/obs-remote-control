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
 * Gets the enable state of a scene item.
 *
 * Scenes and Groups
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemEnabledResponse extends RequestResponse<GetSceneItemEnabledResponse.Data> {
    /**
     * @return Whether the scene item is enabled. `true` for enabled, `false` for disabled
     */
    public boolean isSceneItemEnabled() {
        return getData().getResponseData().isSceneItemEnabled();
    }

    /**
     * GetSceneItemEnabled Request Response Data
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
         * Whether the scene item is enabled. `true` for enabled, `false` for disabled
         */
        @JsonProperty("sceneItemEnabled")
        private boolean sceneItemEnabled;
    }
}
