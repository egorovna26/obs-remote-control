package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

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
 * Creates a new input, adding it as a scene item to the specified scene.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateInputResponse extends RequestResponse<CreateInputResponse.Data> {
    /**
     * @return UUID of the newly created input
     */
    public String getInputUuid() {
        return getData().getResponseData().getInputUuid();
    }

    /**
     * @return ID of the newly created scene item
     */
    public int getSceneItemId() {
        return getData().getResponseData().getSceneItemId();
    }

    /**
     * CreateInput Request Response Data
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
         * UUID of the newly created input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * ID of the newly created scene item
         */
        @JsonProperty("sceneItemId")
        private int sceneItemId;
    }
}
