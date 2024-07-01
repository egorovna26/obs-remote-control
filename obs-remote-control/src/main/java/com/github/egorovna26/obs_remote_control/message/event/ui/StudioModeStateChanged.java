package com.github.egorovna26.obs_remote_control.message.event.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Studio mode has been enabled or disabled.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StudioModeStateChanged extends Event<StudioModeStateChanged.Data> {
    /**
     * @return True == Enabled, False == Disabled
     */
    public boolean isStudioModeEnabled() {
        return getData().getEventData().isStudioModeEnabled();
    }

    /**
     * StudioModeStateChanged Event Data
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
         * True == Enabled, False == Disabled
         */
        @JsonProperty("studioModeEnabled")
        private boolean studioModeEnabled;
    }
}
