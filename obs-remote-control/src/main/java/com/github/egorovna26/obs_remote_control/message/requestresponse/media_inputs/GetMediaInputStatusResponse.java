package com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
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
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetMediaInputStatusResponse extends RequestResponse<GetMediaInputStatusResponse.Data> {
    /**
     * @return State of the media input
     */
    public String getMediaState() {
        return getData().getResponseData().getMediaState();
    }

    /**
     * @return Total duration of the playing media in milliseconds. `null` if not playing
     */
    public int getMediaDuration() {
        return getData().getResponseData().getMediaDuration();
    }

    /**
     * @return Position of the cursor in milliseconds. `null` if not playing
     */
    public int getMediaCursor() {
        return getData().getResponseData().getMediaCursor();
    }

    /**
     * GetMediaInputStatus Request Response Data
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
         * State of the media input
         */
        @JsonProperty("mediaState")
        private String mediaState;

        /**
         * Total duration of the playing media in milliseconds. `null` if not playing
         */
        @JsonProperty("mediaDuration")
        private int mediaDuration;

        /**
         * Position of the cursor in milliseconds. `null` if not playing
         */
        @JsonProperty("mediaCursor")
        private int mediaCursor;
    }
}
