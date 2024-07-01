package com.github.egorovna26.obs_remote_control.message.request.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the value of a "slot" from the selected persistent data realm.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetPersistentDataRequest extends Request<GetPersistentDataRequest.Data> {
    /**
     * GetPersistentDataRequest constructor
     */
    public GetPersistentDataRequest(String realm, String slotName) {
        super("GetPersistentData", new Data(realm, slotName));
    }

    /**
     * GetPersistentData Request Data
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
    }
}
