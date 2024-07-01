package com.github.egorovna26.obs_remote_control.message.requestresponse.filters;

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
 * Gets an array of all available source filter kinds.
 *
 * Similar to `GetInputKindList`
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceFilterKindListResponse extends RequestResponse<GetSourceFilterKindListResponse.Data> {
    /**
     * @return Array of source filter kinds
     */
    public Object getSourceFilterKinds() {
        return getData().getResponseData().getSourceFilterKinds();
    }

    /**
     * GetSourceFilterKindList Request Response Data
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
         * Array of source filter kinds
         */
        @JsonProperty("sourceFilterKinds")
        private Object sourceFilterKinds;
    }
}
