package com.github.egorovna26.obs_remote_control.message.event.scenes;

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
 * A scene has been removed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneRemoved extends Event<SceneRemoved.Data> {
    /**
     * @return Name of the removed scene
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * @return UUID of the removed scene
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * @return Whether the scene was a group
     */
    public boolean isGroup() {
        return getData().getEventData().isGroup();
    }

    /**
     * SceneRemoved Event Data
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
         * Name of the removed scene
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the removed scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Whether the scene was a group
         */
        @JsonProperty("isGroup")
        private boolean isGroup;
    }
}
