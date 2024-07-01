package com.github.egorovna26.obs_remote_control.message.event.filters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A source's filter list has been reindexed.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SourceFilterListReindexed extends Event<SourceFilterListReindexed.Data> {
    /**
     * @return Name of the source
     */
    public String getSourceName() {
        return getData().getEventData().getSourceName();
    }

    /**
     * @return Array of filter objects
     */
    public Object getFilters() {
        return getData().getEventData().getFilters();
    }

    /**
     * SourceFilterListReindexed Event Data
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
         * Name of the source
         */
        @JsonProperty("sourceName")
        private String sourceName;

        /**
         * Array of filter objects
         */
        @JsonProperty("filters")
        private Object filters;
    }
}
