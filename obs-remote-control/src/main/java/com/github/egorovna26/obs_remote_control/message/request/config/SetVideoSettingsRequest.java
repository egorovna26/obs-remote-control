package com.github.egorovna26.obs_remote_control.message.request.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the current video settings.
 *
 * Note: Fields must be specified in pairs. For example, you cannot set only `baseWidth` without needing to specify `baseHeight`.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetVideoSettingsRequest extends Request<SetVideoSettingsRequest.Data> {
    /**
     * SetVideoSettingsRequest constructor
     */
    public SetVideoSettingsRequest(int fpsNumerator, int fpsDenominator, int baseWidth,
            int baseHeight, int outputWidth, int outputHeight) {
        super("SetVideoSettings", new Data(fpsNumerator, fpsDenominator, baseWidth, baseHeight, outputWidth, outputHeight));
    }

    /**
     * SetVideoSettings Request Data
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
