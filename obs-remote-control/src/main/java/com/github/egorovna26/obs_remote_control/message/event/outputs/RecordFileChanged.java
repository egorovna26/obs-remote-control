package com.github.egorovna26.obs_remote_control.message.event.outputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The record output has started writing to a new file. For example, when a file split happens.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RecordFileChanged extends Event<RecordFileChanged.Data> {
    /**
     * @return File name that the output has begun writing to
     */
    public String getNewOutputPath() {
        return getData().getEventData().getNewOutputPath();
    }

    /**
     * RecordFileChanged Event Data
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
         * File name that the output has begun writing to
         */
        @JsonProperty("newOutputPath")
        private String newOutputPath;
    }
}
