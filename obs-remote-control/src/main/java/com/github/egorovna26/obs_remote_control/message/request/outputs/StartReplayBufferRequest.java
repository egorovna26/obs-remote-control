package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Starts the replay buffer output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StartReplayBufferRequest extends Request<Void> {
    /**
     * StartReplayBufferRequest constructor
     */
    public StartReplayBufferRequest() {
        super("StartReplayBuffer", null);
    }
}
