package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

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
 * Gets the settings of an output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetOutputSettingsResponse extends RequestResponse<GetOutputSettingsResponse.Data> {
    /**
     * @return Output settings
     */
    public Object getOutputSettings() {
        return getData().getResponseData().getOutputSettings();
    }

    /**
     * GetOutputSettings Request Response Data
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
         * Output settings
         */
        @JsonProperty("outputSettings")
        private Object outputSettings;
    }
}
