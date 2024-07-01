package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current video settings.
 *
 * Note: To get the true FPS value, divide the FPS numerator by the FPS denominator. Example: `60000/1001`
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetVideoSettingsResponse extends RequestResponse<GetVideoSettingsResponse.Data> {
    /**
     * @return Numerator of the fractional FPS value
     */
    public int getFpsNumerator() {
        return getData().getResponseData().getFpsNumerator();
    }

    /**
     * @return Denominator of the fractional FPS value
     */
    public int getFpsDenominator() {
        return getData().getResponseData().getFpsDenominator();
    }

    /**
     * @return Width of the base (canvas) resolution in pixels
     */
    public int getBaseWidth() {
        return getData().getResponseData().getBaseWidth();
    }

    /**
     * @return Height of the base (canvas) resolution in pixels
     */
    public int getBaseHeight() {
        return getData().getResponseData().getBaseHeight();
    }

    /**
     * @return Width of the output resolution in pixels
     */
    public int getOutputWidth() {
        return getData().getResponseData().getOutputWidth();
    }

    /**
     * @return Height of the output resolution in pixels
     */
    public int getOutputHeight() {
        return getData().getResponseData().getOutputHeight();
    }

    /**
     * GetVideoSettings Request Response Data
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
         * Numerator of the fractional FPS value
         */
        @JsonProperty("fpsNumerator")
        private int fpsNumerator;

        /**
         * Denominator of the fractional FPS value
         */
        @JsonProperty("fpsDenominator")
        private int fpsDenominator;

        /**
         * Width of the base (canvas) resolution in pixels
         */
        @JsonProperty("baseWidth")
        private int baseWidth;

        /**
         * Height of the base (canvas) resolution in pixels
         */
        @JsonProperty("baseHeight")
        private int baseHeight;

        /**
         * Width of the output resolution in pixels
         */
        @JsonProperty("outputWidth")
        private int outputWidth;

        /**
         * Height of the output resolution in pixels
         */
        @JsonProperty("outputHeight")
        private int outputHeight;
    }
}
