package com.github.egorovna26.obs_remote_control.message.event.inputs;

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
 * The sync offset of an input has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputAudioSyncOffsetChanged extends Event<InputAudioSyncOffsetChanged.Data> {
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
     * @return New sync offset in milliseconds
     */
    public int getInputAudioSyncOffset() {
        return getData().getEventData().getInputAudioSyncOffset();
    }

    /**
     * InputAudioSyncOffsetChanged Event Data
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
         * New sync offset in milliseconds
         */
        @JsonProperty("inputAudioSyncOffset")
        private int inputAudioSyncOffset;
    }
}
