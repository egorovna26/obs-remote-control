package com.github.egorovna26.obs_remote_control.message.requestresponse.general;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Triggers a hotkey using its name. See `GetHotkeyList`.
 *
 * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class TriggerHotkeyByNameResponse extends RequestResponse<Void> {
}
