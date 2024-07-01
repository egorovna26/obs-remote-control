package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets a parameter from the current profile's configuration.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetProfileParameterResponse extends RequestResponse<GetProfileParameterResponse.Data> {
    /**
     * @return Value associated with the parameter. `null` if not set and no default
     */
    public String getParameterValue() {
        return getData().getResponseData().getParameterValue();
    }

    /**
     * @return Default value associated with the parameter. `null` if no default
     */
    public String getDefaultParameterValue() {
        return getData().getResponseData().getDefaultParameterValue();
    }

    /**
     * GetProfileParameter Request Response Data
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
         * Value associated with the parameter. `null` if not set and no default
         */
        @JsonProperty("parameterValue")
        private String parameterValue;

        /**
         * Default value associated with the parameter. `null` if no default
         */
        @JsonProperty("defaultParameterValue")
        private String defaultParameterValue;
    }
}
