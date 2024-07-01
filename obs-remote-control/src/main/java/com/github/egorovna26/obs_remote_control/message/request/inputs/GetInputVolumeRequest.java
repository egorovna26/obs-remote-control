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
 * Gets the current volume setting of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputVolumeRequest extends Request<GetInputVolumeRequest.Data> {
    /**
     * GetInputVolumeRequest constructor
     */
    public GetInputVolumeRequest(String inputName, String inputUuid) {
        super("GetInputVolume", new Data(inputName, inputUuid));
    }

    /**
     * GetInputVolume Request Data
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
         * Name of the input to get the volume of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to get the volume of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
