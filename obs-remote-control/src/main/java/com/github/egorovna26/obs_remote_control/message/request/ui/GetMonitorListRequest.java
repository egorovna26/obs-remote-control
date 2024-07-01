package com.github.egorovna26.obs_remote_control.message.request.ui;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets a list of connected monitors and information about them.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetMonitorListRequest extends Request<Void> {
    /**
     * GetMonitorListRequest constructor
     */
    public GetMonitorListRequest() {
        super("GetMonitorList", null);
    }
}
