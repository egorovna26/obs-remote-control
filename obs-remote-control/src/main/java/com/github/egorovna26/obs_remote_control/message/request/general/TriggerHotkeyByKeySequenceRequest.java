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
 * Triggers a hotkey using a sequence of keys.
 *
 * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerHotkeyByKeySequenceRequest extends Request<TriggerHotkeyByKeySequenceRequest.Data> {
    /**
     * TriggerHotkeyByKeySequenceRequest constructor
     */
    public TriggerHotkeyByKeySequenceRequest(String keyId, Object keyModifiers) {
        super("TriggerHotkeyByKeySequence", new Data(keyId, keyModifiers));
    }

    /**
     * TriggerHotkeyByKeySequence Request Data
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
         * The OBS key ID to use. See https://github.com/obsproject/obs-studio/blob/master/libobs/obs-hotkeys.h
         */
        @JsonProperty("keyId")
        private String keyId;

        /**
         * Object containing key modifiers to apply
         */
        @JsonProperty("keyModifiers")
        private Object keyModifiers;
    }
}
