package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the settings of the current scene transition.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentSceneTransitionSettingsResponse extends RequestResponse<Void> {
}
