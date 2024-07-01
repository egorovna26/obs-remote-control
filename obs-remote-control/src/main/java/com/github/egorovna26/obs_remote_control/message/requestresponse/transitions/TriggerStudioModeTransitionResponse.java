package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Triggers the current scene transition. Same functionality as the `Transition` button in studio mode.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerStudioModeTransitionResponse extends RequestResponse<Void> {
}
