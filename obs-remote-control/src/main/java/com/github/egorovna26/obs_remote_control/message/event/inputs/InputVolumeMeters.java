package com.github.egorovna26.obs_remote_control.message.event.inputs;

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
 * A high-volume event providing volume levels of all active inputs every 50 milliseconds.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputVolumeMeters extends Event<InputVolumeMeters.Data> {
    /**
     * @return Array of active inputs with their associated volume levels
     */
    public Object getInputs() {
        return getData().getEventData().getInputs();
    }

    /**
     * InputVolumeMeters Event Data
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
         * Array of active inputs with their associated volume levels
         */
        @JsonProperty("inputs")
        private Object inputs;
    }
}
