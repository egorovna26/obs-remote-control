package com.github.egorovna26.obs_remote_control.message.request.filters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the default settings for a filter kind.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceFilterDefaultSettingsRequest extends Request<GetSourceFilterDefaultSettingsRequest.Data> {
    /**
     * GetSourceFilterDefaultSettingsRequest constructor
     */
    public GetSourceFilterDefaultSettingsRequest(String filterKind) {
        super("GetSourceFilterDefaultSettings", new Data(filterKind));
    }

    /**
     * GetSourceFilterDefaultSettings Request Data
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
         * Filter kind to get the default settings for
         */
        @JsonProperty("filterKind")
        private String filterKind;
    }
}
