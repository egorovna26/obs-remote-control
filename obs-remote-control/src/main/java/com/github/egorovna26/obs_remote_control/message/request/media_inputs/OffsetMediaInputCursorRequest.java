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
 * Offsets the current cursor position of a media input by the specified value.
 *
 * This request does not perform bounds checking of the cursor position.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OffsetMediaInputCursorRequest extends Request<OffsetMediaInputCursorRequest.Data> {
    /**
     * OffsetMediaInputCursorRequest constructor
     */
    public OffsetMediaInputCursorRequest(String inputName, String inputUuid,
            int mediaCursorOffset) {
        super("OffsetMediaInputCursor", new Data(inputName, inputUuid, mediaCursorOffset));
    }

    /**
     * OffsetMediaInputCursor Request Data
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

        /**
         * Value to offset the current cursor position by
         */
        @JsonProperty("mediaCursorOffset")
        private int mediaCursorOffset;
    }
}
