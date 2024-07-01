package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Starts the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class StartRecordRequest extends Request<Void> {
    /**
     * StartRecordRequest constructor
     */
    public StartRecordRequest() {
        super("StartRecord", null);
    }
}
