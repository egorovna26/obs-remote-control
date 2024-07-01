package com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Triggers an action on a media input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerMediaInputActionResponse extends RequestResponse<Void> {
}
