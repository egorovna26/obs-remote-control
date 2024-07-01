package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the current directory that the record output is set to.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetRecordDirectoryResponse extends RequestResponse<GetRecordDirectoryResponse.Data> {
    /**
     * @return Output directory
     */
    public String getRecordDirectory() {
        return getData().getResponseData().getRecordDirectory();
    }

    /**
     * GetRecordDirectory Request Response Data
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
