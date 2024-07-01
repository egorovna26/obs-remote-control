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
 * A filter has been added to a source.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SourceFilterCreated extends Event<SourceFilterCreated.Data> {
    /**
     * @return Name of the source the filter was added to
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
     * @return The kind of the filter
     */
    public String getFilterKind() {
        return getData().getEventData().getFilterKind();
    }

    /**
     * @return Index position of the filter
     */
    public int getFilterIndex() {
        return getData().getEventData().getFilterIndex();
    }

    /**
     * @return The settings configured to the filter when it was created
     */
    public Object getFilterSettings() {
        return getData().getEventData().getFilterSettings();
    }

    /**
     * @return The default settings for the filter
     */
    public Object getDefaultFilterSettings() {
        return getData().getEventData().getDefaultFilterSettings();
    }

    /**
     * SourceFilterCreated Event Data
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
         * Name of the source the filter was added to
         */
        @JsonProperty("sourceName")
        private String sourceName;

        /**
         * Name of the filter
         */
        @JsonProperty("filterName")
        private String filterName;

        /**
         * The kind of the filter
         */
        @JsonProperty("filterKind")
        private String filterKind;

        /**
         * Index position of the filter
         */
        @JsonProperty("filterIndex")
        private int filterIndex;

        /**
         * The settings configured to the filter when it was created
         */
        @JsonProperty("filterSettings")
        private Object filterSettings;

        /**
         * The default settings for the filter
         */
        @JsonProperty("defaultFilterSettings")
        private Object defaultFilterSettings;
    }
}
