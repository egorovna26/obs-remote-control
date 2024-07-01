package com.github.egorovna26.obs_remote_control.message.event.scene_items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A scene item's enable state has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneItemEnableStateChanged extends Event<SceneItemEnableStateChanged.Data> {
    /**
     * @return Name of the scene the item is in
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * @return UUID of the scene the item is in
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * @return Numeric ID of the scene item
     */
    public int getSceneItemId() {
        return getData().getEventData().getSceneItemId();
    }

    /**
     * @return Whether the scene item is enabled (visible)
     */
    public boolean isSceneItemEnabled() {
        return getData().getEventData().isSceneItemEnabled();
    }

    /**
     * SceneItemEnableStateChanged Event Data
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

        /**
         * Whether the scene item is enabled (visible)
         */
        @JsonProperty("sceneItemEnabled")
        private boolean sceneItemEnabled;
    }
}
