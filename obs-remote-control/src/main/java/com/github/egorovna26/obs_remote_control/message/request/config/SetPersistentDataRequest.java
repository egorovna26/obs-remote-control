package com.github.egorovna26.obs_remote_control.message.request.config;

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
 * Sets the value of a "slot" from the selected persistent data realm.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetPersistentDataRequest extends Request<SetPersistentDataRequest.Data> {
    /**
     * SetPersistentDataRequest constructor
     */
    public SetPersistentDataRequest(String realm, String slotName, Object slotValue) {
        super("SetPersistentData", new Data(realm, slotName, slotValue));
    }

    /**
     * SetPersistentData Request Data
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
         * The data realm to select. `OBS_WEBSOCKET_DATA_REALM_GLOBAL` or `OBS_WEBSOCKET_DATA_REALM_PROFILE`
         */
        @JsonProperty("realm")
        private String realm;

        /**
         * The name of the slot to retrieve data from
         */
        @JsonProperty("slotName")
        private String slotName;

        /**
         * The value to apply to the slot
         */
        @JsonProperty("slotValue")
        private Object slotValue;
    }
}
