package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the settings of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputSettingsRequest extends Request<SetInputSettingsRequest.Data> {
    /**
     * SetInputSettingsRequest constructor
     */
    public SetInputSettingsRequest(String inputName, String inputUuid, Object inputSettings,
            boolean overlay) {
        super("SetInputSettings", new Data(inputName, inputUuid, inputSettings, overlay));
    }

    /**
     * SetInputSettings Request Data
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
         * Name of the input to set the settings of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to set the settings of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Object of settings to apply
         */
        @JsonProperty("inputSettings")
        private Object inputSettings;

        /**
         * True == apply the settings on top of existing ones, False == reset the input to its defaults, then apply settings.
         */
        @JsonProperty("overlay")
        private boolean overlay;
    }
}
