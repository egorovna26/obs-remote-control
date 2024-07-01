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
 * Gets the audio monitor type of an input.
 *
 * The available audio monitor types are:
 *
 * - `OBS_MONITORING_TYPE_NONE`
 * - `OBS_MONITORING_TYPE_MONITOR_ONLY`
 * - `OBS_MONITORING_TYPE_MONITOR_AND_OUTPUT`
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputAudioMonitorTypeResponse extends RequestResponse<GetInputAudioMonitorTypeResponse.Data> {
    /**
     * @return Audio monitor type
     */
    public String getMonitorType() {
        return getData().getResponseData().getMonitorType();
    }

    /**
     * GetInputAudioMonitorType Request Response Data
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
         * Audio monitor type
         */
        @JsonProperty("monitorType")
        private String monitorType;
    }
}
