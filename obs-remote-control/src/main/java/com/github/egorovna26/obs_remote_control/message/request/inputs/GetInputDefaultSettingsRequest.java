package com.github.egorovna26.obs_remote_control.message.request.inputs;

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
 * Gets the default settings for an input kind.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputDefaultSettingsRequest extends Request<GetInputDefaultSettingsRequest.Data> {
    /**
     * GetInputDefaultSettingsRequest constructor
     */
    public GetInputDefaultSettingsRequest(String inputKind) {
        super("GetInputDefaultSettings", new Data(inputKind));
    }

    /**
     * GetInputDefaultSettings Request Data
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
         * Input kind to get the default settings for
         */
        @JsonProperty("inputKind")
        private String inputKind;
    }
}
