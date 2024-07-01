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
 * Triggers an action on a media input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerMediaInputActionRequest extends Request<TriggerMediaInputActionRequest.Data> {
    /**
     * TriggerMediaInputActionRequest constructor
     */
    public TriggerMediaInputActionRequest(String inputName, String inputUuid, String mediaAction) {
        super("TriggerMediaInputAction", new Data(inputName, inputUuid, mediaAction));
    }

    /**
     * TriggerMediaInputAction Request Data
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
         * Identifier of the `ObsMediaInputAction` enum
         */
        @JsonProperty("mediaAction")
        private String mediaAction;
    }
}
