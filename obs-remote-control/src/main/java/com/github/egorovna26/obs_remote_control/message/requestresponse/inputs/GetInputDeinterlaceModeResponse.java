package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

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
 * Gets the deinterlace mode of an input.
 *
 * Deinterlace Modes:
 *
 * - `OBS_DEINTERLACE_MODE_DISABLE`
 * - `OBS_DEINTERLACE_MODE_DISCARD`
 * - `OBS_DEINTERLACE_MODE_RETRO`
 * - `OBS_DEINTERLACE_MODE_BLEND`
 * - `OBS_DEINTERLACE_MODE_BLEND_2X`
 * - `OBS_DEINTERLACE_MODE_LINEAR`
 * - `OBS_DEINTERLACE_MODE_LINEAR_2X`
 * - `OBS_DEINTERLACE_MODE_YADIF`
 * - `OBS_DEINTERLACE_MODE_YADIF_2X`
 *
 * Note: Deinterlacing functionality is restricted to async inputs only.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputDeinterlaceModeResponse extends RequestResponse<GetInputDeinterlaceModeResponse.Data> {
    /**
     * @return Deinterlace mode of the input
     */
    public String getInputDeinterlaceMode() {
        return getData().getResponseData().getInputDeinterlaceMode();
    }

    /**
     * GetInputDeinterlaceMode Request Response Data
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
         * Deinterlace mode of the input
         */
        @JsonProperty("inputDeinterlaceMode")
        private String inputDeinterlaceMode;
    }
}
