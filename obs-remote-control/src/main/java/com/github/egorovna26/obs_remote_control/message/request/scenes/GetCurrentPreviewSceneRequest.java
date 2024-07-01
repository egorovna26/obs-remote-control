package com.github.egorovna26.obs_remote_control.message.request.scenes;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current preview scene.
 *
 * Only available when studio mode is enabled.
 *
 * Note: This request is slated to have the `currentPreview`-prefixed fields removed from in an upcoming RPC version.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetCurrentPreviewSceneRequest extends Request<Void> {
    /**
     * GetCurrentPreviewSceneRequest constructor
     */
    public GetCurrentPreviewSceneRequest() {
        super("GetCurrentPreviewScene", null);
    }
}
