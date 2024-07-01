package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles pause on the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleRecordPauseRequest extends Request<Void> {
    /**
     * ToggleRecordPauseRequest constructor
     */
    public ToggleRecordPauseRequest() {
        super("ToggleRecordPause", null);
    }
}
