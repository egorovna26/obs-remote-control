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
 * A new scene has been created.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneCreated extends Event<SceneCreated.Data> {
    /**
     * @return Name of the new scene
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * @return UUID of the new scene
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * @return Whether the new scene is a group
     */
    public boolean isGroup() {
        return getData().getEventData().isGroup();
    }

    /**
     * SceneCreated Event Data
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
         * Name of the new scene
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the new scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Whether the new scene is a group
         */
        @JsonProperty("isGroup")
        private boolean isGroup;
    }
}
