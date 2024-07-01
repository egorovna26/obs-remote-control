package com.github.egorovna26.obs_remote_control.message.request.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sleeps for a time duration or number of frames. Only available in request batches with types `SERIAL_REALTIME` or `SERIAL_FRAME`.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SleepRequest extends Request<SleepRequest.Data> {
    /**
     * SleepRequest constructor
     */
    public SleepRequest(int sleepMillis, int sleepFrames) {
        super("Sleep", new Data(sleepMillis, sleepFrames));
    }

    /**
     * Sleep Request Data
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
         * Number of milliseconds to sleep for (if `SERIAL_REALTIME` mode)
         */
        @JsonProperty("sleepMillis")
        private int sleepMillis;

        /**
         * Number of frames to sleep for (if `SERIAL_FRAME` mode)
         */
        @JsonProperty("sleepFrames")
        private int sleepFrames;
    }
}
