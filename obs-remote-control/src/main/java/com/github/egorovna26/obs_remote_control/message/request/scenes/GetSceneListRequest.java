package com.github.egorovna26.obs_remote_control.message.request.scenes;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all scenes in OBS.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneListRequest extends Request<Void> {
    /**
     * GetSceneListRequest constructor
     */
    public GetSceneListRequest() {
        super("GetSceneList", null);
    }
}
