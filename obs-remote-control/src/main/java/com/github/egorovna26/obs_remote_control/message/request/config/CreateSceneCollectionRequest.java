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
 * Creates a new scene collection, switching to it in the process.
 *
 * Note: This will block until the collection has finished changing.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateSceneCollectionRequest extends Request<CreateSceneCollectionRequest.Data> {
    /**
     * CreateSceneCollectionRequest constructor
     */
    public CreateSceneCollectionRequest(String sceneCollectionName) {
        super("CreateSceneCollection", new Data(sceneCollectionName));
    }

    /**
     * CreateSceneCollection Request Data
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
         * Name for the new scene collection
         */
        @JsonProperty("sceneCollectionName")
        private String sceneCollectionName;
    }
}
