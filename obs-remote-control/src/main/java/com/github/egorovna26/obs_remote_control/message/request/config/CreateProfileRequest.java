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
 * Creates a new profile, switching to it in the process
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateProfileRequest extends Request<CreateProfileRequest.Data> {
    /**
     * CreateProfileRequest constructor
     */
    public CreateProfileRequest(String profileName) {
        super("CreateProfile", new Data(profileName));
    }

    /**
     * CreateProfile Request Data
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
         * Name for the new profile
         */
        @JsonProperty("profileName")
        private String profileName;
    }
}
