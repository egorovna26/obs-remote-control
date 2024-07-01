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
 * The current preview scene has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentPreviewSceneChanged extends Event<CurrentPreviewSceneChanged.Data> {
    /**
     * @return Name of the scene that was switched to
     */
    public String getSceneName() {
        return getData().getEventData().getSceneName();
    }

    /**
     * @return UUID of the scene that was switched to
     */
    public String getSceneUuid() {
        return getData().getEventData().getSceneUuid();
    }

    /**
     * CurrentPreviewSceneChanged Event Data
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
         * Name of the scene that was switched to
         */
        @JsonProperty("sceneName")
        private String sceneName;

        /**
         * UUID of the scene that was switched to
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;
    }
}
