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
 * Gets the audio balance of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioBalanceResponse extends RequestResponse<GetInputAudioBalanceResponse.Data> {
    /**
     * @return Audio balance value from 0.0-1.0
     */
    public int getInputAudioBalance() {
        return getData().getResponseData().getInputAudioBalance();
    }

    /**
     * GetInputAudioBalance Request Response Data
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
         * Audio balance value from 0.0-1.0
         */
        @JsonProperty("inputAudioBalance")
        private int inputAudioBalance;
    }
}
