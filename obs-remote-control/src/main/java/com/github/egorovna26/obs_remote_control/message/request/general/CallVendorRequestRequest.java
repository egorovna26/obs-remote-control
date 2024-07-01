package com.github.egorovna26.obs_remote_control.message.request.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Call a request registered to a vendor.
 *
 * A vendor is a unique name registered by a third-party plugin or script, which allows for custom requests and events to be added to obs-websocket.
 * If a plugin or script implements vendor requests or events, documentation is expected to be provided with them.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CallVendorRequestRequest extends Request<CallVendorRequestRequest.Data> {
    /**
     * CallVendorRequestRequest constructor
     */
    public CallVendorRequestRequest(String vendorName, String requestType, Object requestData) {
        super("CallVendorRequest", new Data(vendorName, requestType, requestData));
    }

    /**
     * CallVendorRequest Request Data
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
         * Name of the vendor to use
         */
        @JsonProperty("vendorName")
        private String vendorName;

        /**
         * The request type to call
         */
        @JsonProperty("requestType")
        private String requestType;

        /**
         * Object containing appropriate request data
         */
        @JsonProperty("requestData")
        private Object requestData;
    }
}
