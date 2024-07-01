package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the status of the virtualcam output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetVirtualCamStatusResponse extends RequestResponse<GetVirtualCamStatusResponse.Data> {
    /**
     * @return Whether the output is active
     */
    public boolean isOutputActive() {
        return getData().getResponseData().isOutputActive();
    }

    /**
     * GetVirtualCamStatus Request Response Data
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
         * Whether the output is active
         */
        @JsonProperty("outputActive")
        private boolean outputActive;
    }
}
