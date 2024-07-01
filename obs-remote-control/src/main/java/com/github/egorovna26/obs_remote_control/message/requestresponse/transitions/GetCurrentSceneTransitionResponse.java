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
 * Gets information about the current scene transition.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetCurrentSceneTransitionResponse extends RequestResponse<GetCurrentSceneTransitionResponse.Data> {
    /**
     * @return Name of the transition
     */
    public String getTransitionName() {
        return getData().getResponseData().getTransitionName();
    }

    /**
     * @return UUID of the transition
     */
    public String getTransitionUuid() {
        return getData().getResponseData().getTransitionUuid();
    }

    /**
     * @return Kind of the transition
     */
    public String getTransitionKind() {
        return getData().getResponseData().getTransitionKind();
    }

    /**
     * @return Whether the transition uses a fixed (unconfigurable) duration
     */
    public boolean isTransitionFixed() {
        return getData().getResponseData().isTransitionFixed();
    }

    /**
     * @return Configured transition duration in milliseconds. `null` if transition is fixed
     */
    public int getTransitionDuration() {
        return getData().getResponseData().getTransitionDuration();
    }

    /**
     * @return Whether the transition supports being configured
     */
    public boolean isTransitionConfigurable() {
        return getData().getResponseData().isTransitionConfigurable();
    }

    /**
     * @return Object of settings for the transition. `null` if transition is not configurable
     */
    public Object getTransitionSettings() {
        return getData().getResponseData().getTransitionSettings();
    }

    /**
     * GetCurrentSceneTransition Request Response Data
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
         * Name of the transition
         */
        @JsonProperty("transitionName")
        private String transitionName;

        /**
         * UUID of the transition
         */
        @JsonProperty("transitionUuid")
        private String transitionUuid;

        /**
         * Kind of the transition
         */
        @JsonProperty("transitionKind")
        private String transitionKind;

        /**
         * Whether the transition uses a fixed (unconfigurable) duration
         */
        @JsonProperty("transitionFixed")
        private boolean transitionFixed;

        /**
         * Configured transition duration in milliseconds. `null` if transition is fixed
         */
        @JsonProperty("transitionDuration")
        private int transitionDuration;

        /**
         * Whether the transition supports being configured
         */
        @JsonProperty("transitionConfigurable")
        private boolean transitionConfigurable;

        /**
         * Object of settings for the transition. `null` if transition is not configurable
         */
        @JsonProperty("transitionSettings")
        private Object transitionSettings;
    }
}
