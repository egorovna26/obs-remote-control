package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the settings of an input.
 *
 * Note: Does not include defaults. To create the entire settings object, overlay `inputSettings` over the `defaultInputSettings` provided by `GetInputDefaultSettings`.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputSettingsRequest extends Request<GetInputSettingsRequest.Data> {
    /**
     * GetInputSettingsRequest constructor
     */
    public GetInputSettingsRequest(String inputName, String inputUuid) {
        super("GetInputSettings", new Data(inputName, inputUuid));
    }

    /**
     * GetInputSettings Request Data
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
         * Name of the input to get the settings of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to get the settings of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
