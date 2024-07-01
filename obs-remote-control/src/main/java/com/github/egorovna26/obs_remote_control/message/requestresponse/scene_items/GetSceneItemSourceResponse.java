package com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items;

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
 * Gets the source associated with a scene item.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemSourceResponse extends RequestResponse<GetSceneItemSourceResponse.Data> {
    /**
     * @return Name of the source associated with the scene item
     */
    public String getSourceName() {
        return getData().getResponseData().getSourceName();
    }

    /**
     * @return UUID of the source associated with the scene item
     */
    public String getSourceUuid() {
        return getData().getResponseData().getSourceUuid();
    }

    /**
     * GetSceneItemSource Request Response Data
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
         * Name of the source associated with the scene item
         */
        @JsonProperty("sourceName")
        private String sourceName;

        /**
         * UUID of the source associated with the scene item
         */
        @JsonProperty("sourceUuid")
        private String sourceUuid;
    }
}
