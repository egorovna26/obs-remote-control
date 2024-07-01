package com.github.egorovna26.obs_remote_control.message.request.stream;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Starts the stream output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StartStreamRequest extends Request<Void> {
    /**
     * StartStreamRequest constructor
     */
    public StartStreamRequest() {
        super("StartStream", null);
    }
}
