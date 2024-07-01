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
 * The current profile has begun changing.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CurrentProfileChanging extends Event<CurrentProfileChanging.Data> {
    /**
     * @return Name of the current profile
     */
    public String getProfileName() {
        return getData().getEventData().getProfileName();
    }

    /**
     * CurrentProfileChanging Event Data
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
         * Name of the current profile
         */
        @JsonProperty("profileName")
        private String profileName;
    }
}
