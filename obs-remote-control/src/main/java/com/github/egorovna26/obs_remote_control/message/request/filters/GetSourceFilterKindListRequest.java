package com.github.egorovna26.obs_remote_control.message.request.filters;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all available source filter kinds.
 *
 * Similar to `GetInputKindList`
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceFilterKindListRequest extends Request<Void> {
    /**
     * GetSourceFilterKindListRequest constructor
     */
    public GetSourceFilterKindListRequest() {
        super("GetSourceFilterKindList", null);
    }
}
