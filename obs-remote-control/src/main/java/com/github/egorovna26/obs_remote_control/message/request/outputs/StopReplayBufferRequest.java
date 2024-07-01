package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Stops the replay buffer output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StopReplayBufferRequest extends Request<Void> {
    /**
     * StopReplayBufferRequest constructor
     */
    public StopReplayBufferRequest() {
        super("StopReplayBuffer", null);
    }
}
