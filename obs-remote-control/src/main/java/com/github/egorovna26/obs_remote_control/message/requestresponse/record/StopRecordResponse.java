package com.github.egorovna26.obs_remote_control.message.requestresponse.record;

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
 * Stops the record output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StopRecordResponse extends RequestResponse<StopRecordResponse.Data> {
    /**
     * @return File name for the saved recording
     */
    public String getOutputPath() {
        return getData().getResponseData().getOutputPath();
    }

    /**
     * StopRecord Request Response Data
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
         * File name for the saved recording
         */
        @JsonProperty("outputPath")
        private String outputPath;
    }
}
