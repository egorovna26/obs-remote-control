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
 * Gets the status of the record output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetRecordStatusResponse extends RequestResponse<GetRecordStatusResponse.Data> {
    /**
     * @return Whether the output is active
     */
    public boolean isOutputActive() {
        return getData().getResponseData().isOutputActive();
    }

    /**
     * @return Whether the output is paused
     */
    public boolean isOutputPaused() {
        return getData().getResponseData().isOutputPaused();
    }

    /**
     * @return Current formatted timecode string for the output
     */
    public String getOutputTimecode() {
        return getData().getResponseData().getOutputTimecode();
    }

    /**
     * @return Current duration in milliseconds for the output
     */
    public int getOutputDuration() {
        return getData().getResponseData().getOutputDuration();
    }

    /**
     * @return Number of bytes sent by the output
     */
    public int getOutputBytes() {
        return getData().getResponseData().getOutputBytes();
    }

    /**
     * GetRecordStatus Request Response Data
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

        /**
         * Whether the output is paused
         */
        @JsonProperty("outputPaused")
        private boolean outputPaused;

        /**
         * Current formatted timecode string for the output
         */
        @JsonProperty("outputTimecode")
        private String outputTimecode;

        /**
         * Current duration in milliseconds for the output
         */
        @JsonProperty("outputDuration")
        private int outputDuration;

        /**
         * Number of bytes sent by the output
         */
        @JsonProperty("outputBytes")
        private int outputBytes;
    }
}
