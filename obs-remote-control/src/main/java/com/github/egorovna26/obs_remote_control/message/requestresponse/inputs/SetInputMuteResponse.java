package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the audio mute state of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputMuteResponse extends RequestResponse<Void> {
}
