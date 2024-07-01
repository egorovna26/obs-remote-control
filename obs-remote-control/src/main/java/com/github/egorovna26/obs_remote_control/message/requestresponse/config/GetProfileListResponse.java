package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

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
 * Gets an array of all profiles
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetProfileListResponse extends RequestResponse<GetProfileListResponse.Data> {
    /**
     * @return The name of the current profile
     */
    public String getCurrentProfileName() {
        return getData().getResponseData().getCurrentProfileName();
    }

    /**
     * @return Array of all available profiles
     */
    public Object getProfiles() {
        return getData().getResponseData().getProfiles();
    }

    /**
     * GetProfileList Request Response Data
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
         * The name of the current profile
         */
        @JsonProperty("currentProfileName")
        private String currentProfileName;

        /**
         * Array of all available profiles
         */
        @JsonProperty("profiles")
        private Object profiles;
    }
}
