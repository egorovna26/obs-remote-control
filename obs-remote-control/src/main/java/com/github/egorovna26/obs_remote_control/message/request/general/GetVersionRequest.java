package com.github.egorovna26.obs_remote_control.message.request.general;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets data about the current plugin and RPC version.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetVersionRequest extends Request<Void> {
    /**
     * GetVersionRequest constructor
     */
    public GetVersionRequest() {
        super("GetVersion", null);
    }
}
