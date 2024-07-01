package com.github.egorovna26.obs_remote_control.message.request.outputs;

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
 * Sets the settings of an output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetOutputSettingsRequest extends Request<SetOutputSettingsRequest.Data> {
    /**
     * SetOutputSettingsRequest constructor
     */
    public SetOutputSettingsRequest(String outputName, Object outputSettings) {
        super("SetOutputSettings", new Data(outputName, outputSettings));
    }

    /**
     * SetOutputSettings Request Data
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
         * Output name
         */
        @JsonProperty("outputName")
        private String outputName;

        /**
         * Output settings
         */
        @JsonProperty("outputSettings")
        private Object outputSettings;
    }
}
