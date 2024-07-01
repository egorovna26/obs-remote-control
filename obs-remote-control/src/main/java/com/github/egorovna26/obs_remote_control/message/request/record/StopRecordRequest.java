package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Stops the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StopRecordRequest extends Request<Void> {
    /**
     * StopRecordRequest constructor
     */
    public StopRecordRequest() {
        super("StopRecord", null);
    }
}
