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
 * An input's show state has changed.
 *
 * When an input is showing, it means it's being shown by the preview or a dialog.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputShowStateChanged extends Event<InputShowStateChanged.Data> {
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
     * @return Whether the input is showing
     */
    public boolean isVideoShowing() {
        return getData().getEventData().isVideoShowing();
    }

    /**
     * InputShowStateChanged Event Data
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
         * Whether the input is showing
         */
        @JsonProperty("videoShowing")
        private boolean videoShowing;
    }
}
