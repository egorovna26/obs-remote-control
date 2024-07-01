package com.github.egorovna26.obs_remote_control.message.request.transitions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the position of the TBar.
 *
 * **Very important note**: This will be deprecated and replaced in a future version of obs-websocket.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetTBarPositionRequest extends Request<SetTBarPositionRequest.Data> {
    /**
     * SetTBarPositionRequest constructor
     */
    public SetTBarPositionRequest(int position, boolean release) {
        super("SetTBarPosition", new Data(position, release));
    }

    /**
     * SetTBarPosition Request Data
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
         * New position
         */
        @JsonProperty("position")
        private int position;

        /**
         * Whether to release the TBar. Only set `false` if you know that you will be sending another position update
         */
        @JsonProperty("release")
        private boolean release;
    }
}
