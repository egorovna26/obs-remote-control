package com.github.egorovna26.obs_remote_control.message.request.config;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.lang.Void;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all scene collections
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneCollectionListRequest extends Request<Void> {
    /**
     * GetSceneCollectionListRequest constructor
     */
    public GetSceneCollectionListRequest() {
        super("GetSceneCollectionList", null);
    }
}
