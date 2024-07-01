package com.github.egorovna26.obs_remote_control.message.requestresponse.scenes;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the scene transition overridden for a scene.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetSceneSceneTransitionOverrideResponse extends RequestResponse<Void> {
}
