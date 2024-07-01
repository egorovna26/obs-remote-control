package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the cursor position of the current scene transition.
 *
 * Note: `transitionCursor` will return 1.0 when the transition is inactive.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetCurrentSceneTransitionCursorResponse extends RequestResponse<GetCurrentSceneTransitionCursorResponse.Data> {
    /**
     * @return Cursor position, between 0.0 and 1.0
     */
    public int getTransitionCursor() {
        return getData().getResponseData().getTransitionCursor();
    }

    /**
     * GetCurrentSceneTransitionCursor Request Response Data
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
         * Cursor position, between 0.0 and 1.0
         */
        @JsonProperty("transitionCursor")
        private int transitionCursor;
    }
}
