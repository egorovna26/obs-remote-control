package com.github.egorovna26.obs_remote_control.message.request.general;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets statistics about OBS, obs-websocket, and the current session.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetStatsRequest extends Request<Void> {
    /**
     * GetStatsRequest constructor
     */
    public GetStatsRequest() {
        super("GetStats", null);
    }
}
