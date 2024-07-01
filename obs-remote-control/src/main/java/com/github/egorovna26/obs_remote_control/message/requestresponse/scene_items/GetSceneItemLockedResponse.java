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
 * Gets the lock state of a scene item.
 *
 * Scenes and Groups
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemLockedResponse extends RequestResponse<GetSceneItemLockedResponse.Data> {
    /**
     * @return Whether the scene item is locked. `true` for locked, `false` for unlocked
     */
    public boolean isSceneItemLocked() {
        return getData().getResponseData().isSceneItemLocked();
    }

    /**
     * GetSceneItemLocked Request Response Data
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
         * Whether the scene item is locked. `true` for locked, `false` for unlocked
         */
        @JsonProperty("sceneItemLocked")
        private boolean sceneItemLocked;
    }
}
