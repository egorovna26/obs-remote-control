package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
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
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputSettingsResponse extends RequestResponse<GetInputSettingsResponse.Data> {
    /**
     * @return Object of settings for the input
     */
    public Object getInputSettings() {
        return getData().getResponseData().getInputSettings();
    }

    /**
     * @return The kind of the input
     */
    public String getInputKind() {
        return getData().getResponseData().getInputKind();
    }

    /**
     * GetInputSettings Request Response Data
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
         * Object of settings for the input
         */
        @JsonProperty("inputSettings")
        private Object inputSettings;

        /**
         * The kind of the input
         */
        @JsonProperty("inputKind")
        private String inputKind;
    }
}
