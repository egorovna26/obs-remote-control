package com.github.egorovna26.obs_remote_control.message.requestresponse.stream;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sends CEA-608 caption text over the stream output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SendStreamCaptionResponse extends RequestResponse<Void> {
}
