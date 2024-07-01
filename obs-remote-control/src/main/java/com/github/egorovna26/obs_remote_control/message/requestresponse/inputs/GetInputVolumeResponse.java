package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current volume setting of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputVolumeResponse extends RequestResponse<GetInputVolumeResponse.Data> {
    /**
     * @return Volume setting in mul
     */
    public int getInputVolumeMul() {
        return getData().getResponseData().getInputVolumeMul();
    }

    /**
     * @return Volume setting in dB
     */
    public int getInputVolumeDb() {
        return getData().getResponseData().getInputVolumeDb();
    }

    /**
     * GetInputVolume Request Response Data
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
         * Volume setting in mul
         */
        @JsonProperty("inputVolumeMul")
        private int inputVolumeMul;

        /**
         * Volume setting in dB
         */
        @JsonProperty("inputVolumeDb")
        private int inputVolumeDb;
    }
}
