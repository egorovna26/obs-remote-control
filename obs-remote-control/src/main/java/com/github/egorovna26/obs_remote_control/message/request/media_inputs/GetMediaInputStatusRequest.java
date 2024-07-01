package com.github.egorovna26.obs_remote_control.message.request.media_inputs;

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
 * Gets the status of a media input.
 *
 * Media States:
 *
 * - `OBS_MEDIA_STATE_NONE`
 * - `OBS_MEDIA_STATE_PLAYING`
 * - `OBS_MEDIA_STATE_OPENING`
 * - `OBS_MEDIA_STATE_BUFFERING`
 * - `OBS_MEDIA_STATE_PAUSED`
 * - `OBS_MEDIA_STATE_STOPPED`
 * - `OBS_MEDIA_STATE_ENDED`
 * - `OBS_MEDIA_STATE_ERROR`
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetMediaInputStatusRequest extends Request<GetMediaInputStatusRequest.Data> {
    /**
     * GetMediaInputStatusRequest constructor
     */
    public GetMediaInputStatusRequest(String inputName, String inputUuid) {
        super("GetMediaInputStatus", new Data(inputName, inputUuid));
    }

    /**
     * GetMediaInputStatus Request Data
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
         * Name of the media input
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the media input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
