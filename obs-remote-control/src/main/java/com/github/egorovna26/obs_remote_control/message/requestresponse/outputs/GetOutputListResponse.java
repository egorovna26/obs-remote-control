package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

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
 * Gets the list of available outputs.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetOutputListResponse extends RequestResponse<GetOutputListResponse.Data> {
    /**
     * @return Array of outputs
     */
    public Object getOutputs() {
        return getData().getResponseData().getOutputs();
    }

    /**
     * GetOutputList Request Response Data
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
         * Array of outputs
         */
        @JsonProperty("outputs")
        private Object outputs;
    }
}
