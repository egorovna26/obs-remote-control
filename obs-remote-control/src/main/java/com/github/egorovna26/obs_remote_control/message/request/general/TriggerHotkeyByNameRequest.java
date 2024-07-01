package com.github.egorovna26.obs_remote_control.message.request.general;

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
 * Triggers a hotkey using its name. See `GetHotkeyList`.
 *
 * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerHotkeyByNameRequest extends Request<TriggerHotkeyByNameRequest.Data> {
    /**
     * TriggerHotkeyByNameRequest constructor
     */
    public TriggerHotkeyByNameRequest(String hotkeyName, String contextName) {
        super("TriggerHotkeyByName", new Data(hotkeyName, contextName));
    }

    /**
     * TriggerHotkeyByName Request Data
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
         * Name of the hotkey to trigger
         */
        @JsonProperty("hotkeyName")
        private String hotkeyName;

        /**
         * Name of context of the hotkey to trigger
         */
        @JsonProperty("contextName")
        private String contextName;
    }
}
