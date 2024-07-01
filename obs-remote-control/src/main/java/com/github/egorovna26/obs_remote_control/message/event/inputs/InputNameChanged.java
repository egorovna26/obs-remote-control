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
 * The name of an input has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputNameChanged extends Event<InputNameChanged.Data> {
    /**
     * @return UUID of the input
     */
    public String getInputUuid() {
        return getData().getEventData().getInputUuid();
    }

    /**
     * @return Old name of the input
     */
    public String getOldInputName() {
        return getData().getEventData().getOldInputName();
    }

    /**
     * @return New name of the input
     */
    public String getInputName() {
        return getData().getEventData().getInputName();
    }

    /**
     * InputNameChanged Event Data
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
         * UUID of the input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Old name of the input
         */
        @JsonProperty("oldInputName")
        private String oldInputName;

        /**
         * New name of the input
         */
        @JsonProperty("inputName")
        private String inputName;
    }
}
