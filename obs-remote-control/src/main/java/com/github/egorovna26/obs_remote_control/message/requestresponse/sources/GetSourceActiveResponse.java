package com.github.egorovna26.obs_remote_control.message.requestresponse.sources;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the active and show state of a source.
 *
 * **Compatible with inputs and scenes.**
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSourceActiveResponse extends RequestResponse<GetSourceActiveResponse.Data> {
    /**
     * @return Whether the source is showing in Program
     */
    public boolean isVideoActive() {
        return getData().getResponseData().isVideoActive();
    }

    /**
     * @return Whether the source is showing in the UI (Preview, Projector, Properties)
     */
    public boolean isVideoShowing() {
        return getData().getResponseData().isVideoShowing();
    }

    /**
     * GetSourceActive Request Response Data
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
         * Whether the source is showing in Program
         */
        @JsonProperty("videoActive")
        private boolean videoActive;

        /**
         * Whether the source is showing in the UI (Preview, Projector, Properties)
         */
        @JsonProperty("videoShowing")
        private boolean videoShowing;
    }
}
