package com.github.egorovna26.obs_remote_control.message.requestresponse.filters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the info for a specific source filter.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceFilterResponse extends RequestResponse<GetSourceFilterResponse.Data> {
    /**
     * @return Whether the filter is enabled
     */
    public boolean isFilterEnabled() {
        return getData().getResponseData().isFilterEnabled();
    }

    /**
     * @return Index of the filter in the list, beginning at 0
     */
    public int getFilterIndex() {
        return getData().getResponseData().getFilterIndex();
    }

    /**
     * @return The kind of filter
     */
    public String getFilterKind() {
        return getData().getResponseData().getFilterKind();
    }

    /**
     * @return Settings object associated with the filter
     */
    public Object getFilterSettings() {
        return getData().getResponseData().getFilterSettings();
    }

    /**
     * GetSourceFilter Request Response Data
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
         * Whether the filter is enabled
         */
        @JsonProperty("filterEnabled")
        private boolean filterEnabled;

        /**
         * Index of the filter in the list, beginning at 0
         */
        @JsonProperty("filterIndex")
        private int filterIndex;

        /**
         * The kind of filter
         */
        @JsonProperty("filterKind")
        private String filterKind;

        /**
         * Settings object associated with the filter
         */
        @JsonProperty("filterSettings")
        private Object filterSettings;
    }
}
