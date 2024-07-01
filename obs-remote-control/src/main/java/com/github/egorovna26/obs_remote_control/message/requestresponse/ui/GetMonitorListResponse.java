package com.github.egorovna26.obs_remote_control.message.requestresponse.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets a list of connected monitors and information about them.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetMonitorListResponse extends RequestResponse<GetMonitorListResponse.Data> {
    /**
     * @return a list of detected monitors with some information
     */
    public Object getMonitors() {
        return getData().getResponseData().getMonitors();
    }

    /**
     * GetMonitorList Request Response Data
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
         * a list of detected monitors with some information
         */
        @JsonProperty("monitors")
        private Object monitors;
    }
}
