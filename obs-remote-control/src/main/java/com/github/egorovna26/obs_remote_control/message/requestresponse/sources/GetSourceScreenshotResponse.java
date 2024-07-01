package com.github.egorovna26.obs_remote_control.message.requestresponse.sources;

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
 * Gets a Base64-encoded screenshot of a source.
 *
 * The `imageWidth` and `imageHeight` parameters are treated as "scale to inner", meaning the smallest ratio will be used and the aspect ratio of the original resolution is kept.
 * If `imageWidth` and `imageHeight` are not specified, the compressed image will use the full resolution of the source.
 *
 * **Compatible with inputs and scenes.**
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceScreenshotResponse extends RequestResponse<GetSourceScreenshotResponse.Data> {
    /**
     * @return Base64-encoded screenshot
     */
    public String getImageData() {
        return getData().getResponseData().getImageData();
    }

    /**
     * GetSourceScreenshot Request Response Data
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
         * Base64-encoded screenshot
         */
        @JsonProperty("imageData")
        private String imageData;
    }
}
