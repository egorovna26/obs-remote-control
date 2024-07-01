package com.github.egorovna26.obs_remote_control.message.request.config;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current directory that the record output is set to.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetRecordDirectoryRequest extends Request<Void> {
    /**
     * GetRecordDirectoryRequest constructor
     */
    public GetRecordDirectoryRequest() {
        super("GetRecordDirectory", null);
    }
}
