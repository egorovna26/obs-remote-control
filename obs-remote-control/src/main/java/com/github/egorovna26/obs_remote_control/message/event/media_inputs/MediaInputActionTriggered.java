package com.github.egorovna26.obs_remote_control.message.event.media_inputs;

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
 * An action has been performed on an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class MediaInputActionTriggered extends Event<MediaInputActionTriggered.Data> {
    /**
     * @return Name of the input
     */
    public String getInputName() {
        return getData().getEventData().getInputName();
    }

    /**
     * @return UUID of the input
     */
    public String getInputUuid() {
        return getData().getEventData().getInputUuid();
    }

    /**
     * @return Action performed on the input. See `ObsMediaInputAction` enum
     */
    public String getMediaAction() {
        return getData().getEventData().getMediaAction();
    }

    /**
     * MediaInputActionTriggered Event Data
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
         * Name of the input
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Action performed on the input. See `ObsMediaInputAction` enum
         */
        @JsonProperty("mediaAction")
        private String mediaAction;
    }
}
