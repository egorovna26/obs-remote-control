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
 * Sets the deinterlace field order of an input.
 *
 * Note: Deinterlacing functionality is restricted to async inputs only.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputDeinterlaceFieldOrderRequest extends Request<SetInputDeinterlaceFieldOrderRequest.Data> {
    /**
     * SetInputDeinterlaceFieldOrderRequest constructor
     */
    public SetInputDeinterlaceFieldOrderRequest(String inputName, String inputUuid,
            String inputDeinterlaceFieldOrder) {
        super("SetInputDeinterlaceFieldOrder", new Data(inputName, inputUuid, inputDeinterlaceFieldOrder));
    }

    /**
     * SetInputDeinterlaceFieldOrder Request Data
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
         * Deinterlace field order for the input
         */
        @JsonProperty("inputDeinterlaceFieldOrder")
        private String inputDeinterlaceFieldOrder;
    }
}
