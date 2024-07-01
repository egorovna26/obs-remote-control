package com.github.egorovna26.obs_remote_control.message.event.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * An event has been emitted from a vendor.
 *
 * A vendor is a unique name registered by a third-party plugin or script, which allows for custom requests and events to be added to obs-websocket.
 * If a plugin or script implements vendor requests or events, documentation is expected to be provided with them.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class VendorEvent extends Event<VendorEvent.Data> {
    /**
     * @return Name of the vendor emitting the event
     */
    public String getVendorName() {
        return getData().getEventData().getVendorName();
    }

    /**
     * @return Vendor-provided event typedef
     */
    public String getEventType() {
        return getData().getEventData().getEventType();
    }

    /**
     * @return Vendor-provided event data. {} if event does not provide any data
     */
    public Object getEventData() {
        return getData().getEventData().getEventData();
    }

    /**
     * VendorEvent Event Data
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
         * Name of the vendor emitting the event
         */
        @JsonProperty("vendorName")
        private String vendorName;

        /**
         * Vendor-provided event typedef
         */
        @JsonProperty("eventType")
        private String eventType;

        /**
         * Vendor-provided event data. {} if event does not provide any data
         */
        @JsonProperty("eventData")
        private Object eventData;
    }
}
