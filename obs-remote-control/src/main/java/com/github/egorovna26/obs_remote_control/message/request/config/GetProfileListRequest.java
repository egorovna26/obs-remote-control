package com.github.egorovna26.obs_remote_control.message.request.config;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all profiles
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetProfileListRequest extends Request<Void> {
    /**
     * GetProfileListRequest constructor
     */
    public GetProfileListRequest() {
        super("GetProfileList", null);
    }
}
