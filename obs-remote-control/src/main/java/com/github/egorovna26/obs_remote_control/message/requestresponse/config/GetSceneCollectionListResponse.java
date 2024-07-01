package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets an array of all scene collections
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneCollectionListResponse extends RequestResponse<GetSceneCollectionListResponse.Data> {
    /**
     * @return The name of the current scene collection
     */
    public String getCurrentSceneCollectionName() {
        return getData().getResponseData().getCurrentSceneCollectionName();
    }

    /**
     * @return Array of all available scene collections
     */
    public Object getSceneCollections() {
        return getData().getResponseData().getSceneCollections();
    }

    /**
     * GetSceneCollectionList Request Response Data
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
         * The name of the current scene collection
         */
        @JsonProperty("currentSceneCollectionName")
        private String currentSceneCollectionName;

        /**
         * Array of all available scene collections
         */
        @JsonProperty("sceneCollections")
        private Object sceneCollections;
    }
}
