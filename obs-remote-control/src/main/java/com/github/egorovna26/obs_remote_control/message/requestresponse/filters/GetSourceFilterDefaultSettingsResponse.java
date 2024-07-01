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
 * Gets the default settings for a filter kind.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceFilterDefaultSettingsResponse extends RequestResponse<GetSourceFilterDefaultSettingsResponse.Data> {
    /**
     * @return Object of default settings for the filter kind
     */
    public Object getDefaultFilterSettings() {
        return getData().getResponseData().getDefaultFilterSettings();
    }

    /**
     * GetSourceFilterDefaultSettings Request Response Data
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
         * Object of default settings for the filter kind
         */
        @JsonProperty("defaultFilterSettings")
        private Object defaultFilterSettings;
    }
}
