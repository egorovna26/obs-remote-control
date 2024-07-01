package com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the cursor position of a media input.
 *
 * This request does not perform bounds checking of the cursor position.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetMediaInputCursorResponse extends RequestResponse<Void> {
}
