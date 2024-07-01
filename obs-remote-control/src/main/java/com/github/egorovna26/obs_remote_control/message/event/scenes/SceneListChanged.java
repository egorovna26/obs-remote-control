package com.github.egorovna26.obs_remote_control.message.event.scenes;

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
 * The list of scenes has changed.
 *
 * TODO: Make OBS fire this event when scenes are reordered.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SceneListChanged extends Event<SceneListChanged.Data> {
    /**
     * @return Updated array of scenes
     */
    public Object getScenes() {
        return getData().getEventData().getScenes();
    }

    /**
     * SceneListChanged Event Data
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
         * Updated array of scenes
         */
        @JsonProperty("scenes")
        private Object scenes;
    }
}
