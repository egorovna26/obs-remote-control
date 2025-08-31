package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
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
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputDeinterlaceFieldOrderResponse extends RequestResponse<GetInputDeinterlaceFieldOrderResponse.Data> {
    /**
     * @return Deinterlace field order of the input
     */
    public String getInputDeinterlaceFieldOrder() {
        return getData().getResponseData().getInputDeinterlaceFieldOrder();
    }

    /**
     * GetInputDeinterlaceFieldOrder Request Response Data
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
         * Deinterlace field order of the input
         */
        @JsonProperty("inputDeinterlaceFieldOrder")
        private String inputDeinterlaceFieldOrder;
    }
}
