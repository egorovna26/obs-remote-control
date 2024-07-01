package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the filename of the last replay buffer save file.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetLastReplayBufferReplayRequest extends Request<Void> {
    /**
     * GetLastReplayBufferReplayRequest constructor
     */
    public GetLastReplayBufferReplayRequest() {
        super("GetLastReplayBufferReplay", null);
    }
}
