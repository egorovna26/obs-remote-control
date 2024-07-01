package com.github.egorovna26.obs_remote_control.message.request.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all available input kinds in OBS.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputKindListRequest extends Request<GetInputKindListRequest.Data> {
    /**
     * GetInputKindListRequest constructor
     */
    public GetInputKindListRequest(boolean unversioned) {
        super("GetInputKindList", new Data(unversioned));
    }

    /**
     * GetInputKindList Request Data
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(
            callSuper = true
    )
    public static class Data implements Serializable {
        /**
         * True == Return all kinds as unversioned, False == Return with version suffixes (if available)
         */
        @JsonProperty("unversioned")
        private boolean unversioned;
    }
}
