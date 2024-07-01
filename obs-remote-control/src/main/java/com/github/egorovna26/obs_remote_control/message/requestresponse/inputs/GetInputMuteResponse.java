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
 * Gets the audio mute state of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputMuteResponse extends RequestResponse<GetInputMuteResponse.Data> {
    /**
     * @return Whether the input is muted
     */
    public boolean isInputMuted() {
        return getData().getResponseData().isInputMuted();
    }

    /**
     * GetInputMute Request Response Data
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
         * Whether the input is muted
         */
        @JsonProperty("inputMuted")
        private boolean inputMuted;
    }
}
