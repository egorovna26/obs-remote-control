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
 * Starts an output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StartOutputRequest extends Request<StartOutputRequest.Data> {
    /**
     * StartOutputRequest constructor
     */
    public StartOutputRequest(String outputName) {
        super("StartOutput", new Data(outputName));
    }

    /**
     * StartOutput Request Data
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
