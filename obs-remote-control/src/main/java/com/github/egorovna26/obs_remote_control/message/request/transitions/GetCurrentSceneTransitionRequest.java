package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets information about the current scene transition.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetCurrentSceneTransitionRequest extends Request<Void> {
    /**
     * GetCurrentSceneTransitionRequest constructor
     */
    public GetCurrentSceneTransitionRequest() {
        super("GetCurrentSceneTransition", null);
    }
}
