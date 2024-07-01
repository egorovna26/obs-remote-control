package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Triggers the current scene transition. Same functionality as the `Transition` button in studio mode.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerStudioModeTransitionRequest extends Request<Void> {
    /**
     * TriggerStudioModeTransitionRequest constructor
     */
    public TriggerStudioModeTransitionRequest() {
        super("TriggerStudioModeTransition", null);
    }
}
