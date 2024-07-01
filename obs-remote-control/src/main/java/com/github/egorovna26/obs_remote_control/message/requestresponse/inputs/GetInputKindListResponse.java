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
 * Gets an array of all available input kinds in OBS.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputKindListResponse extends RequestResponse<GetInputKindListResponse.Data> {
    /**
     * @return Array of input kinds
     */
    public Object getInputKinds() {
        return getData().getResponseData().getInputKinds();
    }

    /**
     * GetInputKindList Request Response Data
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
         * Array of input kinds
         */
        @JsonProperty("inputKinds")
        private Object inputKinds;
    }
}
