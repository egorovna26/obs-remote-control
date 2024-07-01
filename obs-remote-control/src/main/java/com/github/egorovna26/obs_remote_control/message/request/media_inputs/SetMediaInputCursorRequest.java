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
 * Sets the cursor position of a media input.
 *
 * This request does not perform bounds checking of the cursor position.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetMediaInputCursorRequest extends Request<SetMediaInputCursorRequest.Data> {
    /**
     * SetMediaInputCursorRequest constructor
     */
    public SetMediaInputCursorRequest(String inputName, String inputUuid, int mediaCursor) {
        super("SetMediaInputCursor", new Data(inputName, inputUuid, mediaCursor));
    }

    /**
     * SetMediaInputCursor Request Data
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
         * New cursor position to set
         */
        @JsonProperty("mediaCursor")
        private int mediaCursor;
    }
}
