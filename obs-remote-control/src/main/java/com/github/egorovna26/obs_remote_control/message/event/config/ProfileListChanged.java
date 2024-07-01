package com.github.egorovna26.obs_remote_control.message.event.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The profile list has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ProfileListChanged extends Event<ProfileListChanged.Data> {
    /**
     * @return Updated list of profiles
     */
    public Object getProfiles() {
        return getData().getEventData().getProfiles();
    }

    /**
     * ProfileListChanged Event Data
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
         * Updated list of profiles
         */
        @JsonProperty("profiles")
        private Object profiles;
    }
}
