package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all scene transitions in OBS.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneTransitionListRequest extends Request<Void> {
    /**
     * GetSceneTransitionListRequest constructor
     */
    public GetSceneTransitionListRequest() {
        super("GetSceneTransitionList", null);
    }
}
