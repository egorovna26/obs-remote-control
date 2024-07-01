package com.github.egorovna26.obs_remote_control.message.requestresponse.general;

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
 * Gets an array of all hotkey names in OBS.
 *
 * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetHotkeyListResponse extends RequestResponse<GetHotkeyListResponse.Data> {
    /**
     * @return Array of hotkey names
     */
    public Object getHotkeys() {
        return getData().getResponseData().getHotkeys();
    }

    /**
     * GetHotkeyList Request Response Data
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
         * Array of hotkey names
         */
        @JsonProperty("hotkeys")
        private Object hotkeys;
    }
}
