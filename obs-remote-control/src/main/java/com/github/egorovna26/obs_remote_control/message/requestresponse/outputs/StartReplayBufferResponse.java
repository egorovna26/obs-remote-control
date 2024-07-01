package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Starts the replay buffer output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StartReplayBufferResponse extends RequestResponse<Void> {
}
