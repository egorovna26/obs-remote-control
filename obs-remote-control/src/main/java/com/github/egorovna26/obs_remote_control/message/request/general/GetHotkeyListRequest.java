package com.github.egorovna26.obs_remote_control.message.request.general;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all hotkey names in OBS.
 *
 * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetHotkeyListRequest extends Request<Void> {
    /**
     * GetHotkeyListRequest constructor
     */
    public GetHotkeyListRequest() {
        super("GetHotkeyList", null);
    }
}
