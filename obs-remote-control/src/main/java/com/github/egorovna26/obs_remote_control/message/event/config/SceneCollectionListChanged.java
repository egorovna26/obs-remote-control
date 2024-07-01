package com.github.egorovna26.obs_remote_control.message.event.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The scene collection list has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneCollectionListChanged extends Event<SceneCollectionListChanged.Data> {
    /**
     * @return Updated list of scene collections
     */
    public Object getSceneCollections() {
        return getData().getEventData().getSceneCollections();
    }

    /**
     * SceneCollectionListChanged Event Data
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
         * Updated list of scene collections
         */
        @JsonProperty("sceneCollections")
        private Object sceneCollections;
    }
}
