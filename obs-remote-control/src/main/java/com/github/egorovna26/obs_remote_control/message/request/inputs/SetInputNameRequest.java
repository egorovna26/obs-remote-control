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
 * Sets the name of an input (rename).
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputNameRequest extends Request<SetInputNameRequest.Data> {
    /**
     * SetInputNameRequest constructor
     */
    public SetInputNameRequest(String inputName, String inputUuid, String newInputName) {
        super("SetInputName", new Data(inputName, inputUuid, newInputName));
    }

    /**
     * SetInputName Request Data
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
         * Current input name
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * Current input UUID
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * New name for the input
         */
        @JsonProperty("newInputName")
        private String newInputName;
    }
}
