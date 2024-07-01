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
 * Sets the audio monitor type of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetInputAudioMonitorTypeRequest extends Request<SetInputAudioMonitorTypeRequest.Data> {
    /**
     * SetInputAudioMonitorTypeRequest constructor
     */
    public SetInputAudioMonitorTypeRequest(String inputName, String inputUuid, String monitorType) {
        super("SetInputAudioMonitorType", new Data(inputName, inputUuid, monitorType));
    }

    /**
     * SetInputAudioMonitorType Request Data
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
         * Name of the input to set the audio monitor type of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to set the audio monitor type of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Audio monitor type
         */
        @JsonProperty("monitorType")
        private String monitorType;
    }
}
