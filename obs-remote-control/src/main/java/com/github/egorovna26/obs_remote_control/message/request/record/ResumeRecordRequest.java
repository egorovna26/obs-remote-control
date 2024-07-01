package com.github.egorovna26.obs_remote_control.message.request.record;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Resumes the record output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ResumeRecordRequest extends Request<Void> {
    /**
     * ResumeRecordRequest constructor
     */
    public ResumeRecordRequest() {
        super("ResumeRecord", null);
    }
}
