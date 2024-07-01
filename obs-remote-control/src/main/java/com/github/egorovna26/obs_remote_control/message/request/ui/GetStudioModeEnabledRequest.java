package com.github.egorovna26.obs_remote_control.message.request.ui;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets whether studio is enabled.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetStudioModeEnabledRequest extends Request<Void> {
    /**
     * GetStudioModeEnabledRequest constructor
     */
    public GetStudioModeEnabledRequest() {
        super("GetStudioModeEnabled", null);
    }
}
