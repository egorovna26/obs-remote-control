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
 * Toggles the status of an output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleOutputRequest extends Request<ToggleOutputRequest.Data> {
    /**
     * ToggleOutputRequest constructor
     */
    public ToggleOutputRequest(String outputName) {
        super("ToggleOutput", new Data(outputName));
    }

    /**
     * ToggleOutput Request Data
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
