package com.github.egorovna26.obs_remote_control.message.request.outputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the list of available outputs.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetOutputListRequest extends Request<Void> {
    /**
     * GetOutputListRequest constructor
     */
    public GetOutputListRequest() {
        super("GetOutputList", null);
    }
}
