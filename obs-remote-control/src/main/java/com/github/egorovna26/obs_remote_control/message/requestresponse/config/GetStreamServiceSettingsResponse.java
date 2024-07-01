package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current stream service settings (stream destination).
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetStreamServiceSettingsResponse extends RequestResponse<GetStreamServiceSettingsResponse.Data> {
    /**
     * @return Stream service type, like `rtmp_custom` or `rtmp_common`
     */
    public String getStreamServiceType() {
        return getData().getResponseData().getStreamServiceType();
    }

    /**
     * @return Stream service settings
     */
    public Object getStreamServiceSettings() {
        return getData().getResponseData().getStreamServiceSettings();
    }

    /**
     * GetStreamServiceSettings Request Response Data
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
         * Stream service type, like `rtmp_custom` or `rtmp_common`
         */
        @JsonProperty("streamServiceType")
        private String streamServiceType;

        /**
         * Stream service settings
         */
        @JsonProperty("streamServiceSettings")
        private Object streamServiceSettings;
    }
}
