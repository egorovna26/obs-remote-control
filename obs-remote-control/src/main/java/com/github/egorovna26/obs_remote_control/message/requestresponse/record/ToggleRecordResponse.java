package com.github.egorovna26.obs_remote_control.message.requestresponse.record;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles the status of the record output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleRecordResponse extends RequestResponse<ToggleRecordResponse.Data> {
    /**
     * @return The new active state of the output
     */
    public boolean isOutputActive() {
        return getData().getResponseData().isOutputActive();
    }

    /**
     * ToggleRecord Request Response Data
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
         * The new active state of the output
         */
        @JsonProperty("outputActive")
        private boolean outputActive;
    }
}
