package com.github.egorovna26.obs_remote_control.message.event.config;

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
 * The current scene collection has changed.
 *
 * Note: If polling has been paused during `CurrentSceneCollectionChanging`, this is the que to restart polling.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentSceneCollectionChanged extends Event<CurrentSceneCollectionChanged.Data> {
    /**
     * @return Name of the new scene collection
     */
    public String getSceneCollectionName() {
        return getData().getEventData().getSceneCollectionName();
    }

    /**
     * CurrentSceneCollectionChanged Event Data
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
         * Name of the new scene collection
         */
        @JsonProperty("sceneCollectionName")
        private String sceneCollectionName;
    }
}
