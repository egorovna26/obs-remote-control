package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the names of all special inputs.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSpecialInputsRequest extends Request<Void> {
    /**
     * GetSpecialInputsRequest constructor
     */
    public GetSpecialInputsRequest() {
        super("GetSpecialInputs", null);
    }
}
