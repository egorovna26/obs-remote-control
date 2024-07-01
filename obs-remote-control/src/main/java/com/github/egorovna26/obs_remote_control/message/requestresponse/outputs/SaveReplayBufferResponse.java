package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Saves the contents of the replay buffer output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SaveReplayBufferResponse extends RequestResponse<Void> {
}
