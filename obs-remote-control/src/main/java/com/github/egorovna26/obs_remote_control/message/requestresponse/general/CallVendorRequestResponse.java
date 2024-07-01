package com.github.egorovna26.obs_remote_control.message.requestresponse.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
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
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CallVendorRequestResponse extends RequestResponse<CallVendorRequestResponse.Data> {
    /**
     * @return Echoed of `vendorName`
     */
    public String getVendorName() {
        return getData().getResponseData().getVendorName();
    }

    /**
     * @return Echoed of `requestType`
     */
    public String getRequestType() {
        return getData().getResponseData().getRequestType();
    }

    /**
     * @return Object containing appropriate response data. {} if request does not provide any response data
     */
    public Object getResponseData() {
        return getData().getResponseData().getResponseData();
    }

    /**
     * CallVendorRequest Request Response Data
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
         * Echoed of `vendorName`
         */
        @JsonProperty("vendorName")
        private String vendorName;

        /**
         * Echoed of `requestType`
         */
        @JsonProperty("requestType")
        private String requestType;

        /**
         * Object containing appropriate response data. {} if request does not provide any response data
         */
        @JsonProperty("responseData")
        private Object responseData;
    }
}
