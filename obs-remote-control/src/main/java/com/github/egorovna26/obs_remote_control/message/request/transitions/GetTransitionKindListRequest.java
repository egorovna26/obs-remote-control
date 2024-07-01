package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all available transition kinds.
 *
 * Similar to `GetInputKindList`
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetTransitionKindListRequest extends Request<Void> {
    /**
     * GetTransitionKindListRequest constructor
     */
    public GetTransitionKindListRequest() {
        super("GetTransitionKindList", null);
    }
}
