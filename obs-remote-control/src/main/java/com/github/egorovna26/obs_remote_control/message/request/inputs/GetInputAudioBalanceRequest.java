package com.github.egorovna26.obs_remote_control.message.request.inputs;

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
 * Gets the audio balance of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioBalanceRequest extends Request<GetInputAudioBalanceRequest.Data> {
    /**
     * GetInputAudioBalanceRequest constructor
     */
    public GetInputAudioBalanceRequest(String inputName, String inputUuid) {
        super("GetInputAudioBalance", new Data(inputName, inputUuid));
    }

    /**
     * GetInputAudioBalance Request Data
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
         * Name of the input to get the audio balance of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to get the audio balance of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
