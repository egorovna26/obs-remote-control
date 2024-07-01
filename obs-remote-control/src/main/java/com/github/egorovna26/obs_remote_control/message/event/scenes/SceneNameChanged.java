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
 * The name of a scene has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneNameChanged extends Event<SceneNameChanged.Data> {
    /**
     * @return UUID of the scene
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * @return Old name of the scene
     */
    public String getOldSceneName() {
        return getData().getEventData().getOldSceneName();
    }

    /**
     * @return New name of the scene
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * SceneNameChanged Event Data
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
         * UUID of the scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;

        /**
         * Old name of the scene
         */
        @JsonProperty("oldSceneName")
        private String oldSceneName;

        /**
         * New name of the scene
         */
        @JsonProperty("sceneName")
        private String sceneName;
    }
}
