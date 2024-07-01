package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the status of the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetRecordStatusRequest extends Request<Void> {
    /**
     * GetRecordStatusRequest constructor
     */
    public GetRecordStatusRequest() {
        super("GetRecordStatus", null);
    }
}
