package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles the audio mute state of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleInputMuteResponse extends RequestResponse<ToggleInputMuteResponse.Data> {
    /**
     * @return Whether the input has been muted or unmuted
     */
    public boolean isInputMuted() {
        return getData().getResponseData().isInputMuted();
    }

    /**
     * ToggleInputMute Request Response Data
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
         * Whether the input has been muted or unmuted
         */
        @JsonProperty("inputMuted")
        private boolean inputMuted;
    }
}
