package com.github.egorovna26.obs_remote_control.message.requestresponse.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets statistics about OBS, obs-websocket, and the current session.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetStatsResponse extends RequestResponse<GetStatsResponse.Data> {
    /**
     * @return Current CPU usage in percent
     */
    public int getCpuUsage() {
        return getData().getResponseData().getCpuUsage();
    }

    /**
     * @return Amount of memory in MB currently being used by OBS
     */
    public int getMemoryUsage() {
        return getData().getResponseData().getMemoryUsage();
    }

    /**
     * @return Available disk space on the device being used for recording storage
     */
    public int getAvailableDiskSpace() {
        return getData().getResponseData().getAvailableDiskSpace();
    }

    /**
     * @return Current FPS being rendered
     */
    public int getActiveFps() {
        return getData().getResponseData().getActiveFps();
    }

    /**
     * @return Average time in milliseconds that OBS is taking to render a frame
     */
    public int getAverageFrameRenderTime() {
        return getData().getResponseData().getAverageFrameRenderTime();
    }

    /**
     * @return Number of frames skipped by OBS in the render thread
     */
    public int getRenderSkippedFrames() {
        return getData().getResponseData().getRenderSkippedFrames();
    }

    /**
     * @return Total number of frames outputted by the render thread
     */
    public int getRenderTotalFrames() {
        return getData().getResponseData().getRenderTotalFrames();
    }

    /**
     * @return Number of frames skipped by OBS in the output thread
     */
    public int getOutputSkippedFrames() {
        return getData().getResponseData().getOutputSkippedFrames();
    }

    /**
     * @return Total number of frames outputted by the output thread
     */
    public int getOutputTotalFrames() {
        return getData().getResponseData().getOutputTotalFrames();
    }

    /**
     * @return Total number of messages received by obs-websocket from the client
     */
    public int getWebSocketSessionIncomingMessages() {
        return getData().getResponseData().getWebSocketSessionIncomingMessages();
    }

    /**
     * @return Total number of messages sent by obs-websocket to the client
     */
    public int getWebSocketSessionOutgoingMessages() {
        return getData().getResponseData().getWebSocketSessionOutgoingMessages();
    }

    /**
     * GetStats Request Response Data
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
         * Current CPU usage in percent
         */
        @JsonProperty("cpuUsage")
        private int cpuUsage;

        /**
         * Amount of memory in MB currently being used by OBS
         */
        @JsonProperty("memoryUsage")
        private int memoryUsage;

        /**
         * Available disk space on the device being used for recording storage
         */
        @JsonProperty("availableDiskSpace")
        private int availableDiskSpace;

        /**
         * Current FPS being rendered
         */
        @JsonProperty("activeFps")
        private int activeFps;

        /**
         * Average time in milliseconds that OBS is taking to render a frame
         */
        @JsonProperty("averageFrameRenderTime")
        private int averageFrameRenderTime;

        /**
         * Number of frames skipped by OBS in the render thread
         */
        @JsonProperty("renderSkippedFrames")
        private int renderSkippedFrames;

        /**
         * Total number of frames outputted by the render thread
         */
        @JsonProperty("renderTotalFrames")
        private int renderTotalFrames;

        /**
         * Number of frames skipped by OBS in the output thread
         */
        @JsonProperty("outputSkippedFrames")
        private int outputSkippedFrames;

        /**
         * Total number of frames outputted by the output thread
         */
        @JsonProperty("outputTotalFrames")
        private int outputTotalFrames;

        /**
         * Total number of messages received by obs-websocket from the client
         */
        @JsonProperty("webSocketSessionIncomingMessages")
        private int webSocketSessionIncomingMessages;

        /**
         * Total number of messages sent by obs-websocket to the client
         */
        @JsonProperty("webSocketSessionOutgoingMessages")
        private int webSocketSessionOutgoingMessages;
    }
}
