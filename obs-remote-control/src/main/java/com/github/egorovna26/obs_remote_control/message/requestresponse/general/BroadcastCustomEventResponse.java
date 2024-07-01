package com.github.egorovna26.obs_remote_control.message.requestresponse.general;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Broadcasts a `CustomEvent` to all WebSocket clients. Receivers are clients which are identified and subscribed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class BroadcastCustomEventResponse extends RequestResponse<Void> {
}
