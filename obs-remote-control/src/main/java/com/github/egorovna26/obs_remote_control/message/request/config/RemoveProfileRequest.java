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
 * Removes a profile. If the current profile is chosen, it will change to a different profile first.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RemoveProfileRequest extends Request<RemoveProfileRequest.Data> {
    /**
     * RemoveProfileRequest constructor
     */
    public RemoveProfileRequest(String profileName) {
        super("RemoveProfile", new Data(profileName));
    }

    /**
     * RemoveProfile Request Data
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
         * Name of the profile to remove
         */
        @JsonProperty("profileName")
        private String profileName;
    }
}
