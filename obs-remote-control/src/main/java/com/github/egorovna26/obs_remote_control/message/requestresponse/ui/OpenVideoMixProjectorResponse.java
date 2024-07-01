package com.github.egorovna26.obs_remote_control.message.requestresponse.ui;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Opens a projector for a specific output video mix.
 *
 * Mix types:
 *
 * - `OBS_WEBSOCKET_VIDEO_MIX_TYPE_PREVIEW`
 * - `OBS_WEBSOCKET_VIDEO_MIX_TYPE_PROGRAM`
 * - `OBS_WEBSOCKET_VIDEO_MIX_TYPE_MULTIVIEW`
 *
 * Note: This request serves to provide feature parity with 4.x. It is very likely to be changed/deprecated in a future release.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OpenVideoMixProjectorResponse extends RequestResponse<Void> {
}
