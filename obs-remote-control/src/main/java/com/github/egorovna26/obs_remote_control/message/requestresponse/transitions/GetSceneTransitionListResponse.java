package com.github.egorovna26.obs_remote_control.message.requestresponse.transitions;

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
 * Gets an array of all scene transitions in OBS.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneTransitionListResponse extends RequestResponse<GetSceneTransitionListResponse.Data> {
    /**
     * @return Name of the current scene transition. Can be null
     */
    public String getCurrentSceneTransitionName() {
        return getData().getResponseData().getCurrentSceneTransitionName();
    }

    /**
     * @return UUID of the current scene transition. Can be null
     */
    public String getCurrentSceneTransitionUuid() {
        return getData().getResponseData().getCurrentSceneTransitionUuid();
    }

    /**
     * @return Kind of the current scene transition. Can be null
     */
    public String getCurrentSceneTransitionKind() {
        return getData().getResponseData().getCurrentSceneTransitionKind();
    }

    /**
     * @return Array of transitions
     */
    public Object getTransitions() {
        return getData().getResponseData().getTransitions();
    }

    /**
     * GetSceneTransitionList Request Response Data
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
         * Name of the current scene transition. Can be null
         */
        @JsonProperty("currentSceneTransitionName")
        private String currentSceneTransitionName;

        /**
         * UUID of the current scene transition. Can be null
         */
        @JsonProperty("currentSceneTransitionUuid")
        private String currentSceneTransitionUuid;

        /**
         * Kind of the current scene transition. Can be null
         */
        @JsonProperty("currentSceneTransitionKind")
        private String currentSceneTransitionKind;

        /**
         * Array of transitions
         */
        @JsonProperty("transitions")
        private Object transitions;
    }
}
