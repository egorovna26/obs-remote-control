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
 * Gets the scene transition overridden for a scene.
 *
 * Note: A transition UUID response field is not currently able to be implemented as of 2024-1-18.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneSceneTransitionOverrideResponse extends RequestResponse<GetSceneSceneTransitionOverrideResponse.Data> {
    /**
     * @return Name of the overridden scene transition, else `null`
     */
    public String getTransitionName() {
        return getData().getResponseData().getTransitionName();
    }

    /**
     * @return Duration of the overridden scene transition, else `null`
     */
    public int getTransitionDuration() {
        return getData().getResponseData().getTransitionDuration();
    }

    /**
     * GetSceneSceneTransitionOverride Request Response Data
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
         * Name of the overridden scene transition, else `null`
         */
        @JsonProperty("transitionName")
        private String transitionName;

        /**
         * Duration of the overridden scene transition, else `null`
         */
        @JsonProperty("transitionDuration")
        private int transitionDuration;
    }
}
