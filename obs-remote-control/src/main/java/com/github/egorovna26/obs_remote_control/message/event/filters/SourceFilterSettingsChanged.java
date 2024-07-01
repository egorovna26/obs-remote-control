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
 * An source filter's settings have changed (been updated).
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SourceFilterSettingsChanged extends Event<SourceFilterSettingsChanged.Data> {
    /**
     * @return Name of the source the filter is on
     */
    public String getSourceName() {
        return getData().getEventData().getSourceName();
    }

    /**
     * @return Name of the filter
     */
    public String getFilterName() {
        return getData().getEventData().getFilterName();
    }

    /**
     * @return New settings object of the filter
     */
    public Object getFilterSettings() {
        return getData().getEventData().getFilterSettings();
    }

    /**
     * SourceFilterSettingsChanged Event Data
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
         * Name of the source the filter is on
         */
        @JsonProperty("sourceName")
        private String sourceName;

        /**
         * Name of the filter
         */
        @JsonProperty("filterName")
        private String filterName;

        /**
         * New settings object of the filter
         */
        @JsonProperty("filterSettings")
        private Object filterSettings;
    }
}
