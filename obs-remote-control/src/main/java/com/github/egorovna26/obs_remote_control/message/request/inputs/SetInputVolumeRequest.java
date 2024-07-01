package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the volume setting of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputVolumeRequest extends Request<SetInputVolumeRequest.Data> {
    /**
     * SetInputVolumeRequest constructor
     */
    public SetInputVolumeRequest(String inputName, String inputUuid, int inputVolumeMul,
            int inputVolumeDb) {
        super("SetInputVolume", new Data(inputName, inputUuid, inputVolumeMul, inputVolumeDb));
    }

    /**
     * SetInputVolume Request Data
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
         * Name of the input to set the volume of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to set the volume of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

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
