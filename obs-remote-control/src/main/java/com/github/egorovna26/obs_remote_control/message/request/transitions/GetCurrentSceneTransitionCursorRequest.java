package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the cursor position of the current scene transition.
 *
 * Note: `transitionCursor` will return 1.0 when the transition is inactive.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetCurrentSceneTransitionCursorRequest extends Request<Void> {
    /**
     * GetCurrentSceneTransitionCursorRequest constructor
     */
    public GetCurrentSceneTransitionCursorRequest() {
        super("GetCurrentSceneTransitionCursor", null);
    }
}
