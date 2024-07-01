package com.github.egorovna26.obs_remote_control.message.requestresponse.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets data about the current plugin and RPC version.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetVersionResponse extends RequestResponse<GetVersionResponse.Data> {
    /**
     * @return Current OBS Studio version
     */
    public String getObsVersion() {
        return getData().getResponseData().getObsVersion();
    }

    /**
     * @return Current obs-websocket version
     */
    public String getObsWebSocketVersion() {
        return getData().getResponseData().getObsWebSocketVersion();
    }

    /**
     * @return Current latest obs-websocket RPC version
     */
    public int getRpcVersion() {
        return getData().getResponseData().getRpcVersion();
    }

    /**
     * @return Array of available RPC requests for the currently negotiated RPC version
     */
    public Object getAvailableRequests() {
        return getData().getResponseData().getAvailableRequests();
    }

    /**
     * @return Image formats available in `GetSourceScreenshot` and `SaveSourceScreenshot` requests.
     */
    public Object getSupportedImageFormats() {
        return getData().getResponseData().getSupportedImageFormats();
    }

    /**
     * @return Name of the platform. Usually `windows`, `macos`, or `ubuntu` (linux flavor). Not guaranteed to be any of those
     */
    public String getPlatform() {
        return getData().getResponseData().getPlatform();
    }

    /**
     * @return Description of the platform, like `Windows 10 (10.0)`
     */
    public String getPlatformDescription() {
        return getData().getResponseData().getPlatformDescription();
    }

    /**
     * GetVersion Request Response Data
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
         * Current OBS Studio version
         */
        @JsonProperty("obsVersion")
        private String obsVersion;

        /**
         * Current obs-websocket version
         */
        @JsonProperty("obsWebSocketVersion")
        private String obsWebSocketVersion;

        /**
         * Current latest obs-websocket RPC version
         */
        @JsonProperty("rpcVersion")
        private int rpcVersion;

        /**
         * Array of available RPC requests for the currently negotiated RPC version
         */
        @JsonProperty("availableRequests")
        private Object availableRequests;

        /**
         * Image formats available in `GetSourceScreenshot` and `SaveSourceScreenshot` requests.
         */
        @JsonProperty("supportedImageFormats")
        private Object supportedImageFormats;

        /**
         * Name of the platform. Usually `windows`, `macos`, or `ubuntu` (linux flavor). Not guaranteed to be any of those
         */
        @JsonProperty("platform")
        private String platform;

        /**
         * Description of the platform, like `Windows 10 (10.0)`
         */
        @JsonProperty("platformDescription")
        private String platformDescription;
    }
}
