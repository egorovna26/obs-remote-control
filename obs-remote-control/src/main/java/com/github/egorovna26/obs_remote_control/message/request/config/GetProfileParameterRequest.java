package com.github.egorovna26.obs_remote_control.message.request.config;

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
 * Gets a parameter from the current profile's configuration.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetProfileParameterRequest extends Request<GetProfileParameterRequest.Data> {
    /**
     * GetProfileParameterRequest constructor
     */
    public GetProfileParameterRequest(String parameterCategory, String parameterName) {
        super("GetProfileParameter", new Data(parameterCategory, parameterName));
    }

    /**
     * GetProfileParameter Request Data
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
         * Category of the parameter to get
         */
        @JsonProperty("parameterCategory")
        private String parameterCategory;

        /**
         * Name of the parameter to get
         */
        @JsonProperty("parameterName")
        private String parameterName;
    }
}
