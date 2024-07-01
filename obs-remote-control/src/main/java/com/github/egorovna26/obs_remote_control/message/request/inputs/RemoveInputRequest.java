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
 * Removes an existing input.
 *
 * Note: Will immediately remove all associated scene items.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RemoveInputRequest extends Request<RemoveInputRequest.Data> {
    /**
     * RemoveInputRequest constructor
     */
    public RemoveInputRequest(String inputName, String inputUuid) {
        super("RemoveInput", new Data(inputName, inputUuid));
    }

    /**
     * RemoveInput Request Data
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
         * Name of the input to remove
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to remove
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
