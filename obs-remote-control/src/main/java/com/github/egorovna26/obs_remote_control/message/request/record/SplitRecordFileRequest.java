package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Splits the current file being recorded into a new file.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SplitRecordFileRequest extends Request<Void> {
    /**
     * SplitRecordFileRequest constructor
     */
    public SplitRecordFileRequest() {
        super("SplitRecordFile", null);
    }
}
