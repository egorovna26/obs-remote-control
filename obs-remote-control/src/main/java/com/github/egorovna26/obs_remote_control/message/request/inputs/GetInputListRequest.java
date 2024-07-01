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
 * Gets an array of all inputs in OBS.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputListRequest extends Request<GetInputListRequest.Data> {
    /**
     * GetInputListRequest constructor
     */
    public GetInputListRequest(String inputKind) {
        super("GetInputList", new Data(inputKind));
    }

    /**
     * GetInputList Request Data
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
         * Restrict the array to only inputs of the specified kind
         */
        @JsonProperty("inputKind")
        private String inputKind;
    }
}
