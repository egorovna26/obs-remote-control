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
 * An input has been created.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class InputCreated extends Event<InputCreated.Data> {
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
     * @return The kind of the input
     */
    public String getInputKind() {
        return getData().getEventData().getInputKind();
    }

    /**
     * @return The unversioned kind of input (aka no `_v2` stuff)
     */
    public String getUnversionedInputKind() {
        return getData().getEventData().getUnversionedInputKind();
    }

    /**
     * @return Bitflag value for the caps that an input supports. See obs_source_info.output_flags in the libobs docs
     */
    public int getInputKindCaps() {
        return getData().getEventData().getInputKindCaps();
    }

    /**
     * @return The settings configured to the input when it was created
     */
    public Object getInputSettings() {
        return getData().getEventData().getInputSettings();
    }

    /**
     * @return The default settings for the input
     */
    public Object getDefaultInputSettings() {
        return getData().getEventData().getDefaultInputSettings();
    }

    /**
     * InputCreated Event Data
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
         * The kind of the input
         */
        @JsonProperty("inputKind")
        private String inputKind;

        /**
         * The unversioned kind of input (aka no `_v2` stuff)
         */
        @JsonProperty("unversionedInputKind")
        private String unversionedInputKind;

        /**
         * Bitflag value for the caps that an input supports. See obs_source_info.output_flags in the libobs docs
         */
        @JsonProperty("inputKindCaps")
        private int inputKindCaps;

        /**
         * The settings configured to the input when it was created
         */
        @JsonProperty("inputSettings")
        private Object inputSettings;

        /**
         * The default settings for the input
         */
        @JsonProperty("defaultInputSettings")
        private Object defaultInputSettings;
    }
}
