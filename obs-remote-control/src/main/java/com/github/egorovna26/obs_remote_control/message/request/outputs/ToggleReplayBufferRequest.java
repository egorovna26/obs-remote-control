package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles the state of the replay buffer output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleReplayBufferRequest extends Request<Void> {
    /**
     * ToggleReplayBufferRequest constructor
     */
    public ToggleReplayBufferRequest() {
        super("ToggleReplayBuffer", null);
    }
}
