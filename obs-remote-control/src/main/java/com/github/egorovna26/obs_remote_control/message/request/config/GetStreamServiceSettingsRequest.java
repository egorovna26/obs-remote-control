package com.github.egorovna26.obs_remote_control.message.request.config;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current stream service settings (stream destination).
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetStreamServiceSettingsRequest extends Request<Void> {
    /**
     * GetStreamServiceSettingsRequest constructor
     */
    public GetStreamServiceSettingsRequest() {
        super("GetStreamServiceSettings", null);
    }
}
