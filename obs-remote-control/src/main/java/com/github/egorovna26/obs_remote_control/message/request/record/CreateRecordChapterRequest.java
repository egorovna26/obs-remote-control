package com.github.egorovna26.obs_remote_control.message.request.record;

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
 * Adds a new chapter marker to the file currently being recorded.
 *
 * Note: As of OBS 30.2.0, the only file format supporting this feature is Hybrid MP4.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateRecordChapterRequest extends Request<CreateRecordChapterRequest.Data> {
    /**
     * CreateRecordChapterRequest constructor
     */
    public CreateRecordChapterRequest(String chapterName) {
        super("CreateRecordChapter", new Data(chapterName));
    }

    /**
     * CreateRecordChapter Request Data
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
         * Name of the new chapter
         */
        @JsonProperty("chapterName")
        private String chapterName;
    }
}
