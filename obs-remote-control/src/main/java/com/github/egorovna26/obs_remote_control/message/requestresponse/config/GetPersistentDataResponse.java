package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the value of a "slot" from the selected persistent data realm.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetPersistentDataResponse extends RequestResponse<GetPersistentDataResponse.Data> {
    /**
     * @return Value associated with the slot. `null` if not set
     */
    public Object getSlotValue() {
        return getData().getResponseData().getSlotValue();
    }

    /**
     * GetPersistentData Request Response Data
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
         * Value associated with the slot. `null` if not set
         */
        @JsonProperty("slotValue")
        private Object slotValue;
    }
}
