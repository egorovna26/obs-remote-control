package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all inputs in OBS.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputListResponse extends RequestResponse<GetInputListResponse.Data> {
    /**
     * @return Array of inputs
     */
    public Object getInputs() {
        return getData().getResponseData().getInputs();
    }

    /**
     * GetInputList Request Response Data
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
         * Array of inputs
         */
        @JsonProperty("inputs")
        private Object inputs;
    }
}
