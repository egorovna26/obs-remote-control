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
 * Gets the deinterlace field order of an input.
 *
 * Deinterlace Field Orders:
 *
 * - `OBS_DEINTERLACE_FIELD_ORDER_TOP`
 * - `OBS_DEINTERLACE_FIELD_ORDER_BOTTOM`
 *
 * Note: Deinterlacing functionality is restricted to async inputs only.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputDeinterlaceFieldOrderRequest extends Request<GetInputDeinterlaceFieldOrderRequest.Data> {
    /**
     * GetInputDeinterlaceFieldOrderRequest constructor
     */
    public GetInputDeinterlaceFieldOrderRequest(String inputName, String inputUuid) {
        super("GetInputDeinterlaceFieldOrder", new Data(inputName, inputUuid));
    }

    /**
     * GetInputDeinterlaceFieldOrder Request Data
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
    }
}
