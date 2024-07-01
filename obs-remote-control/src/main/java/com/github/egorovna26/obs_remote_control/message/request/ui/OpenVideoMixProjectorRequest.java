package com.github.egorovna26.obs_remote_control.message.request.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
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
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OpenVideoMixProjectorRequest extends Request<OpenVideoMixProjectorRequest.Data> {
    /**
     * OpenVideoMixProjectorRequest constructor
     */
    public OpenVideoMixProjectorRequest(String videoMixType, int monitorIndex,
            String projectorGeometry) {
        super("OpenVideoMixProjector", new Data(videoMixType, monitorIndex, projectorGeometry));
    }

    /**
     * OpenVideoMixProjector Request Data
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(
            callSuper = true
    )
    public static class Data implements Serializable {
        /**
         * Type of mix to open
         */
        @JsonProperty("videoMixType")
        private String videoMixType;

        /**
         * Monitor index, use `GetMonitorList` to obtain index
         */
        @JsonProperty("monitorIndex")
        private int monitorIndex;

        /**
         * Size/Position data for a windowed projector, in Qt Base64 encoded format. Mutually exclusive with `monitorIndex`
         */
        @JsonProperty("projectorGeometry")
        private String projectorGeometry;
    }
}
