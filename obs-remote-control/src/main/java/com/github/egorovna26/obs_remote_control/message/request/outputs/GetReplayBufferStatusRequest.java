package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the status of the replay buffer output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetReplayBufferStatusRequest extends Request<Void> {
    /**
     * GetReplayBufferStatusRequest constructor
     */
    public GetReplayBufferStatusRequest() {
        super("GetReplayBufferStatus", null);
    }
}
