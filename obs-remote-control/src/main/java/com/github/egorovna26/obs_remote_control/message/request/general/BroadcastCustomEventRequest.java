package com.github.egorovna26.obs_remote_control.message.request.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Broadcasts a `CustomEvent` to all WebSocket clients. Receivers are clients which are identified and subscribed.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class BroadcastCustomEventRequest extends Request<BroadcastCustomEventRequest.Data> {
    /**
     * BroadcastCustomEventRequest constructor
     */
    public BroadcastCustomEventRequest(Object eventData) {
        super("BroadcastCustomEvent", new Data(eventData));
    }

    /**
     * BroadcastCustomEvent Request Data
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
         * Data payload to emit to all receivers
         */
        @JsonProperty("eventData")
        private Object eventData;
    }
}
