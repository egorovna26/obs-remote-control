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
 * Switches to a profile.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentProfileRequest extends Request<SetCurrentProfileRequest.Data> {
    /**
     * SetCurrentProfileRequest constructor
     */
    public SetCurrentProfileRequest(String profileName) {
        super("SetCurrentProfile", new Data(profileName));
    }

    /**
     * SetCurrentProfile Request Data
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
         * Name of the profile to switch to
         */
        @JsonProperty("profileName")
        private String profileName;
    }
}
