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
 * A scene item has been created.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneItemCreated extends Event<SceneItemCreated.Data> {
    /**
     * @return Name of the scene the item was added to
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * @return UUID of the scene the item was added to
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * @return Name of the underlying source (input/scene)
     */
    public String getSourceName() {
        return getData().getEventData().getSourceName();
    }

    /**
     * @return UUID of the underlying source (input/scene)
     */
    public String getSourceUuid() {
        return getData().getEventData().getSourceUuid();
    }

    /**
     * @return Numeric ID of the scene item
     */
    public int getSceneItemId() {
        return getData().getEventData().getSceneItemId();
    }

    /**
     * @return Index position of the item
     */
    public int getSceneItemIndex() {
        return getData().getEventData().getSceneItemIndex();
    }

    /**
     * SceneItemCreated Event Data
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
         * Name of the scene the item was added to
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the scene the item was added to
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Name of the underlying source (input/scene)
         */
        @JsonProperty("sourceName")
        private String sourceName;

        /**
         * UUID of the underlying source (input/scene)
         */
        @JsonProperty("sourceUuid")
        private String sourceUuid;

        /**
         * Numeric ID of the scene item
         */
        @JsonProperty("sceneItemId")
        private int sceneItemId;

        /**
         * Index position of the item
         */
        @JsonProperty("sceneItemIndex")
        private int sceneItemIndex;
    }
}
