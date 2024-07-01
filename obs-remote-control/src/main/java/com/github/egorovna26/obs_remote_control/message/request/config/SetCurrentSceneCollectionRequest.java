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
 * Switches to a scene collection.
 *
 * Note: This will block until the collection has finished changing.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetCurrentSceneCollectionRequest extends Request<SetCurrentSceneCollectionRequest.Data> {
    /**
     * SetCurrentSceneCollectionRequest constructor
     */
    public SetCurrentSceneCollectionRequest(String sceneCollectionName) {
        super("SetCurrentSceneCollection", new Data(sceneCollectionName));
    }

    /**
     * SetCurrentSceneCollection Request Data
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
         * Name of the scene collection to switch to
         */
        @JsonProperty("sceneCollectionName")
        private String sceneCollectionName;
    }
}
