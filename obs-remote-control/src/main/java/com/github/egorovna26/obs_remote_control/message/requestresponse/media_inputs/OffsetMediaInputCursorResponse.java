package com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Offsets the current cursor position of a media input by the specified value.
 *
 * This request does not perform bounds checking of the cursor position.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OffsetMediaInputCursorResponse extends RequestResponse<Void> {
}
