package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Toggles the status of the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ToggleRecordRequest extends Request<Void> {
    /**
     * ToggleRecordRequest constructor
     */
    public ToggleRecordRequest() {
        super("ToggleRecord", null);
    }
}
