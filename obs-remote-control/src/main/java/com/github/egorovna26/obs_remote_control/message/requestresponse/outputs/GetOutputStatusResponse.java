package com.github.egorovna26.obs_remote_control.message.requestresponse.outputs;

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
 * Gets the status of an output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetOutputStatusResponse extends RequestResponse<GetOutputStatusResponse.Data> {
    /**
     * @return Whether the output is active
     */
    public boolean isOutputActive() {
        return getData().getResponseData().isOutputActive();
    }

    /**
     * @return Whether the output is reconnecting
     */
    public boolean isOutputReconnecting() {
        return getData().getResponseData().isOutputReconnecting();
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
     * @return Congestion of the output
     */
    public int getOutputCongestion() {
        return getData().getResponseData().getOutputCongestion();
    }

    /**
     * @return Number of bytes sent by the output
     */
    public int getOutputBytes() {
        return getData().getResponseData().getOutputBytes();
    }

    /**
     * @return Number of frames skipped by the output's process
     */
    public int getOutputSkippedFrames() {
        return getData().getResponseData().getOutputSkippedFrames();
    }

    /**
     * @return Total number of frames delivered by the output's process
     */
    public int getOutputTotalFrames() {
        return getData().getResponseData().getOutputTotalFrames();
    }

    /**
     * GetOutputStatus Request Response Data
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
         * Whether the output is reconnecting
         */
        @JsonProperty("outputReconnecting")
        private boolean outputReconnecting;

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
         * Congestion of the output
         */
        @JsonProperty("outputCongestion")
        private int outputCongestion;

        /**
         * Number of bytes sent by the output
         */
        @JsonProperty("outputBytes")
        private int outputBytes;

        /**
         * Number of frames skipped by the output's process
         */
        @JsonProperty("outputSkippedFrames")
        private int outputSkippedFrames;

        /**
         * Total number of frames delivered by the output's process
         */
        @JsonProperty("outputTotalFrames")
        private int outputTotalFrames;
    }
}
