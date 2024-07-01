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
 * Gets an array of all of a source's filters.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceFilterListResponse extends RequestResponse<GetSourceFilterListResponse.Data> {
    /**
     * @return Array of filters
     */
    public Object getFilters() {
        return getData().getResponseData().getFilters();
    }

    /**
     * GetSourceFilterList Request Response Data
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
         * Array of filters
         */
        @JsonProperty("filters")
        private Object filters;
    }
}
