package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Starts the virtualcam output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StartVirtualCamRequest extends Request<Void> {
    /**
     * StartVirtualCamRequest constructor
     */
    public StartVirtualCamRequest() {
        super("StartVirtualCam", null);
    }
}
