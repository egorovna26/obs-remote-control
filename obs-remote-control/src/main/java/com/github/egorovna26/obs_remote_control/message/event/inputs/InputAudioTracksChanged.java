package com.github.egorovna26.obs_remote_control.message.event.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The audio tracks of an input have changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputAudioTracksChanged extends Event<InputAudioTracksChanged.Data> {
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
     * @return Object of audio tracks along with their associated enable states
     */
    public Object getInputAudioTracks() {
        return getData().getEventData().getInputAudioTracks();
    }

    /**
     * InputAudioTracksChanged Event Data
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
         * Object of audio tracks along with their associated enable states
         */
        @JsonProperty("inputAudioTracks")
        private Object inputAudioTracks;
    }
}
