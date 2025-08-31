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
 * Sets the deinterlace mode of an input.
 *
 * Note: Deinterlacing functionality is restricted to async inputs only.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputDeinterlaceModeRequest extends Request<SetInputDeinterlaceModeRequest.Data> {
    /**
     * SetInputDeinterlaceModeRequest constructor
     */
    public SetInputDeinterlaceModeRequest(String inputName, String inputUuid,
            String inputDeinterlaceMode) {
        super("SetInputDeinterlaceMode", new Data(inputName, inputUuid, inputDeinterlaceMode));
    }

    /**
     * SetInputDeinterlaceMode Request Data
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
         * Name of the input
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Deinterlace mode for the input
         */
        @JsonProperty("inputDeinterlaceMode")
        private String inputDeinterlaceMode;
    }
}
