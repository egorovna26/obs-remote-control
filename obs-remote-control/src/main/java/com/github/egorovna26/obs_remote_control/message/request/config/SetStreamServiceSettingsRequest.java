package com.github.egorovna26.obs_remote_control.message.request.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the current stream service settings (stream destination).
 *
 * Note: Simple RTMP settings can be set with type `rtmp_custom` and the settings fields `server` and `key`.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetStreamServiceSettingsRequest extends Request<SetStreamServiceSettingsRequest.Data> {
    /**
     * SetStreamServiceSettingsRequest constructor
     */
    public SetStreamServiceSettingsRequest(String streamServiceType, Object streamServiceSettings) {
        super("SetStreamServiceSettings", new Data(streamServiceType, streamServiceSettings));
    }

    /**
     * SetStreamServiceSettings Request Data
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
         * Type of stream service to apply. Example: `rtmp_common` or `rtmp_custom`
         */
        @JsonProperty("streamServiceType")
        private String streamServiceType;

        /**
         * Settings to apply to the service
         */
        @JsonProperty("streamServiceSettings")
        private Object streamServiceSettings;
    }
}
