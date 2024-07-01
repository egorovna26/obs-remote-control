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
 * The current scene collection has begun changing.
 *
 * Note: We recommend using this event to trigger a pause of all polling requests, as performing any requests during a
 * scene collection change is considered undefined behavior and can cause crashes!
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentSceneCollectionChanging extends Event<CurrentSceneCollectionChanging.Data> {
    /**
     * @return Name of the current scene collection
     */
    public String getSceneCollectionName() {
        return getData().getEventData().getSceneCollectionName();
    }

    /**
     * CurrentSceneCollectionChanging Event Data
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
         * Name of the current scene collection
         */
        @JsonProperty("sceneCollectionName")
        private String sceneCollectionName;
    }
}
