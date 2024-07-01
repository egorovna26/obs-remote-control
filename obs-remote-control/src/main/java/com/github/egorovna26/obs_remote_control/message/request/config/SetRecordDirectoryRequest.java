package com.github.egorovna26.obs_remote_control.message.request.config;

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
 * Sets the current directory that the record output writes files to.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetRecordDirectoryRequest extends Request<SetRecordDirectoryRequest.Data> {
    /**
     * SetRecordDirectoryRequest constructor
     */
    public SetRecordDirectoryRequest(String recordDirectory) {
        super("SetRecordDirectory", new Data(recordDirectory));
    }

    /**
     * SetRecordDirectory Request Data
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
         * Output directory
         */
        @JsonProperty("recordDirectory")
        private String recordDirectory;
    }
}
