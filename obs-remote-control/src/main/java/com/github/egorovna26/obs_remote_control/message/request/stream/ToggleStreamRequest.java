package com.github.egorovna26.obs_remote_control.message.request.stream;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles the status of the stream output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleStreamRequest extends Request<Void> {
    /**
     * ToggleStreamRequest constructor
     */
    public ToggleStreamRequest() {
        super("ToggleStream", null);
    }
}
