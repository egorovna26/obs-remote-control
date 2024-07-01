package com.github.egorovna26.obs_remote_control.message.request.stream;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Stops the stream output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StopStreamRequest extends Request<Void> {
    /**
     * StopStreamRequest constructor
     */
    public StopStreamRequest() {
        super("StopStream", null);
    }
}
