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
 * Gets the audio monitor type of an input.
 *
 * The available audio monitor types are:
 *
 * - `OBS_MONITORING_TYPE_NONE`
 * - `OBS_MONITORING_TYPE_MONITOR_ONLY`
 * - `OBS_MONITORING_TYPE_MONITOR_AND_OUTPUT`
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioMonitorTypeRequest extends Request<GetInputAudioMonitorTypeRequest.Data> {
    /**
     * GetInputAudioMonitorTypeRequest constructor
     */
    public GetInputAudioMonitorTypeRequest(String inputName, String inputUuid) {
        super("GetInputAudioMonitorType", new Data(inputName, inputUuid));
    }

    /**
     * GetInputAudioMonitorType Request Data
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
         * Name of the input to get the audio monitor type of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to get the audio monitor type of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
