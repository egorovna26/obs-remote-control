package com.github.egorovna26.obs_remote_control.message.request.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Enables or disables studio mode
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetStudioModeEnabledRequest extends Request<SetStudioModeEnabledRequest.Data> {
    /**
     * SetStudioModeEnabledRequest constructor
     */
    public SetStudioModeEnabledRequest(boolean studioModeEnabled) {
        super("SetStudioModeEnabled", new Data(studioModeEnabled));
    }

    /**
     * SetStudioModeEnabled Request Data
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
