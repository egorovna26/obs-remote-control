package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Stops the virtualcam output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StopVirtualCamResponse extends RequestResponse<Void> {
}
