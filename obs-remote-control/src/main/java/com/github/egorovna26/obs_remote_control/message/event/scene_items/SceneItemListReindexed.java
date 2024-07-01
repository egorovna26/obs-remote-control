package com.github.egorovna26.obs_remote_control.message.event.scene_items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A scene's item list has been reindexed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneItemListReindexed extends Event<SceneItemListReindexed.Data> {
    /**
     * @return Name of the scene
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * @return UUID of the scene
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * @return Array of scene item objects
     */
    public Object getSceneItems() {
        return getData().getEventData().getSceneItems();
    }

    /**
     * SceneItemListReindexed Event Data
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
         * Name of the scene
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Array of scene item objects
         */
        @JsonProperty("sceneItems")
        private Object sceneItems;
    }
}
