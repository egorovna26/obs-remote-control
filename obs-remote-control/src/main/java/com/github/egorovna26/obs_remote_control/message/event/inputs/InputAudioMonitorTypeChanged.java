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
 * The monitor type of an input has changed.
 *
 * Available types are:
 *
 * - `OBS_MONITORING_TYPE_NONE`
 * - `OBS_MONITORING_TYPE_MONITOR_ONLY`
 * - `OBS_MONITORING_TYPE_MONITOR_AND_OUTPUT`
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputAudioMonitorTypeChanged extends Event<InputAudioMonitorTypeChanged.Data> {
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
     * @return New monitor type of the input
     */
    public String getMonitorType() {
        return getData().getEventData().getMonitorType();
    }

    /**
     * InputAudioMonitorTypeChanged Event Data
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
         * New monitor type of the input
         */
        @JsonProperty("monitorType")
        private String monitorType;
    }
}
