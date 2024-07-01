package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the current stream service settings (stream destination).
 *
 * Note: Simple RTMP settings can be set with type `rtmp_custom` and the settings fields `server` and `key`.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetStreamServiceSettingsResponse extends RequestResponse<Void> {
}
