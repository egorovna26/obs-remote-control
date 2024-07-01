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
 * An input's volume level has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputVolumeChanged extends Event<InputVolumeChanged.Data> {
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
     * @return New volume level multiplier
     */
    public int getInputVolumeMul() {
        return getData().getEventData().getInputVolumeMul();
    }

    /**
     * @return New volume level in dB
     */
    public int getInputVolumeDb() {
        return getData().getEventData().getInputVolumeDb();
    }

    /**
     * InputVolumeChanged Event Data
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
         * New volume level multiplier
         */
        @JsonProperty("inputVolumeMul")
        private int inputVolumeMul;

        /**
         * New volume level in dB
         */
        @JsonProperty("inputVolumeDb")
        private int inputVolumeDb;
    }
}
