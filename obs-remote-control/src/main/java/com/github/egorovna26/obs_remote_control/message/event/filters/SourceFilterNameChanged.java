package com.github.egorovna26.obs_remote_control.message.event.filters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The name of a source filter has changed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SourceFilterNameChanged extends Event<SourceFilterNameChanged.Data> {
    /**
     * @return The source the filter is on
     */
    public String getSourceName() {
        return getData().getEventData().getSourceName();
    }

    /**
     * @return Old name of the filter
     */
    public String getOldFilterName() {
        return getData().getEventData().getOldFilterName();
    }

    /**
     * @return New name of the filter
     */
    public String getFilterName() {
        return getData().getEventData().getFilterName();
    }

    /**
     * SourceFilterNameChanged Event Data
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
         * The source the filter is on
         */
        @JsonProperty("sourceName")
        private String sourceName;

        /**
         * Old name of the filter
         */
        @JsonProperty("oldFilterName")
        private String oldFilterName;

        /**
         * New name of the filter
         */
        @JsonProperty("filterName")
        private String filterName;
    }
}
