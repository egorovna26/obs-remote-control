package com.github.egorovna26.obs_remote_control.message.requestresponse.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets whether studio is enabled.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetStudioModeEnabledResponse extends RequestResponse<GetStudioModeEnabledResponse.Data> {
    /**
     * @return Whether studio mode is enabled
     */
    public boolean isStudioModeEnabled() {
        return getData().getResponseData().isStudioModeEnabled();
    }

    /**
     * GetStudioModeEnabled Request Response Data
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
         * Whether studio mode is enabled
         */
        @JsonProperty("studioModeEnabled")
        private boolean studioModeEnabled;
    }
}
