package com.github.egorovna26.obs_remote_control.message.requestresponse.scenes;

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
 * Creates a new scene in OBS.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateSceneResponse extends RequestResponse<CreateSceneResponse.Data> {
    /**
     * @return UUID of the created scene
     */
    public String getSceneUuid() {
        return getData().getResponseData().getSceneUuid();
    }

    /**
     * CreateScene Request Response Data
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
         * UUID of the created scene
         */
        @JsonProperty("sceneUuid")
        private String sceneUuid;
    }
}
