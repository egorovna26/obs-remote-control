package com.github.egorovna26.obs_remote_control.message.event.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The current profile has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentProfileChanged extends Event<CurrentProfileChanged.Data> {
    /**
     * @return Name of the new profile
     */
    public String getProfileName() {
        return getData().getEventData().getProfileName();
    }

    /**
     * CurrentProfileChanged Event Data
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
         * Name of the new profile
         */
        @JsonProperty("profileName")
        private String profileName;
    }
}
