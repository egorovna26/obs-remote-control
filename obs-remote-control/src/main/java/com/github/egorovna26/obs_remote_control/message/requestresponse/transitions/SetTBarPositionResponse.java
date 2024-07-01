package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the position of the TBar.
 *
 * **Very important note**: This will be deprecated and replaced in a future version of obs-websocket.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetTBarPositionResponse extends RequestResponse<Void> {
}
