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
 * Sets the value of a parameter in the current profile's configuration.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetProfileParameterRequest extends Request<SetProfileParameterRequest.Data> {
    /**
     * SetProfileParameterRequest constructor
     */
    public SetProfileParameterRequest(String parameterCategory, String parameterName,
            String parameterValue) {
        super("SetProfileParameter", new Data(parameterCategory, parameterName, parameterValue));
    }

    /**
     * SetProfileParameter Request Data
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
         * Category of the parameter to set
         */
        @JsonProperty("parameterCategory")
        private String parameterCategory;

        /**
         * Name of the parameter to set
         */
        @JsonProperty("parameterName")
        private String parameterName;

        /**
         * Value of the parameter to set. Use `null` to delete
         */
        @JsonProperty("parameterValue")
        private String parameterValue;
    }
}
