package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Pauses the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class PauseRecordRequest extends Request<Void> {
    /**
     * PauseRecordRequest constructor
     */
    public PauseRecordRequest() {
        super("PauseRecord", null);
    }
}
