package com.github.egorovna26.obs_remote_control.message.requestresponse.ui;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Opens a projector for a source.
 *
 * Note: This request serves to provide feature parity with 4.x. It is very likely to be changed/deprecated in a future release.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OpenSourceProjectorResponse extends RequestResponse<Void> {
}
