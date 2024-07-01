package com.github.egorovna26.obs_remote_control.message.request.config;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current video settings.
 *
 * Note: To get the true FPS value, divide the FPS numerator by the FPS denominator. Example: `60000/1001`
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetVideoSettingsRequest extends Request<Void> {
    /**
     * GetVideoSettingsRequest constructor
     */
    public GetVideoSettingsRequest() {
        super("GetVideoSettings", null);
    }
}
