package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all available transition kinds.
 *
 * Similar to `GetInputKindList`
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetTransitionKindListResponse extends RequestResponse<GetTransitionKindListResponse.Data> {
    /**
     * @return Array of transition kinds
     */
    public Object getTransitionKinds() {
        return getData().getResponseData().getTransitionKinds();
    }

    /**
     * GetTransitionKindList Request Response Data
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
         * Array of transition kinds
         */
        @JsonProperty("transitionKinds")
        private Object transitionKinds;
    }
}
