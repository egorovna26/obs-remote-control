package com.github.egorovna26.obs_remote_control.message.event.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Custom event emitted by `BroadcastCustomEvent`.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CustomEvent extends Event<CustomEvent.Data> {
    /**
     * @return Custom event data
     */
    public Object getEventData() {
        return getData().getEventData().getEventData();
    }

    /**
     * CustomEvent Event Data
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
         * Custom event data
         */
        @JsonProperty("eventData")
        private Object eventData;
    }
}
