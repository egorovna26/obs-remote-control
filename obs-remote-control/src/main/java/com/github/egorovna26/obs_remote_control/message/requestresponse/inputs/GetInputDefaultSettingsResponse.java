package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the default settings for an input kind.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputDefaultSettingsResponse extends RequestResponse<GetInputDefaultSettingsResponse.Data> {
    /**
     * @return Object of default settings for the input kind
     */
    public Object getDefaultInputSettings() {
        return getData().getResponseData().getDefaultInputSettings();
    }

    /**
     * GetInputDefaultSettings Request Response Data
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
         * Object of default settings for the input kind
         */
        @JsonProperty("defaultInputSettings")
        private Object defaultInputSettings;
    }
}
