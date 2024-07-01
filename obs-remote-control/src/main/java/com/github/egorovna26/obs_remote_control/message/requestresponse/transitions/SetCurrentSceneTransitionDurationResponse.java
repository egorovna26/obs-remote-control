package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the duration of the current scene transition, if it is not fixed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentSceneTransitionDurationResponse extends RequestResponse<Void> {
}
