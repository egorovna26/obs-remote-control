package com.github.egorovna26.obs_remote_control.message.request.outputs;

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
 * Gets the status of an output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetOutputStatusRequest extends Request<GetOutputStatusRequest.Data> {
    /**
     * GetOutputStatusRequest constructor
     */
    public GetOutputStatusRequest(String outputName) {
        super("GetOutputStatus", new Data(outputName));
    }

    /**
     * GetOutputStatus Request Data
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
         * Output name
         */
        @JsonProperty("outputName")
        private String outputName;
    }
}
