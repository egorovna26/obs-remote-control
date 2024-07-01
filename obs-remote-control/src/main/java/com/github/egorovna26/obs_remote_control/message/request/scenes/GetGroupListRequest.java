package com.github.egorovna26.obs_remote_control.message.request.scenes;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all groups in OBS.
 *
 * Groups in OBS are actually scenes, but renamed and modified. In obs-websocket, we treat them as scenes where we can.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetGroupListRequest extends Request<Void> {
    /**
     * GetGroupListRequest constructor
     */
    public GetGroupListRequest() {
        super("GetGroupList", null);
    }
}
