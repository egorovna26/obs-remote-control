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
 * Presses a button in the properties of an input.
 *
 * Some known `propertyName` values are:
 *
 * - `refreshnocache` - Browser source reload button
 *
 * Note: Use this in cases where there is a button in the properties of an input that cannot be accessed in any other way. For example, browser sources, where there is a refresh button.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class PressInputPropertiesButtonRequest extends Request<PressInputPropertiesButtonRequest.Data> {
    /**
     * PressInputPropertiesButtonRequest constructor
     */
    public PressInputPropertiesButtonRequest(String inputName, String inputUuid,
            String propertyName) {
        super("PressInputPropertiesButton", new Data(inputName, inputUuid, propertyName));
    }

    /**
     * PressInputPropertiesButton Request Data
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
         * Name of the input
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Name of the button property to press
         */
        @JsonProperty("propertyName")
        private String propertyName;
    }
}
