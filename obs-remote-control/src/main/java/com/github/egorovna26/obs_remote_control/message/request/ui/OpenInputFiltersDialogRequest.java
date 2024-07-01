package com.github.egorovna26.obs_remote_control.message.request.ui;

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
 * Opens the filters dialog of an input.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OpenInputFiltersDialogRequest extends Request<OpenInputFiltersDialogRequest.Data> {
    /**
     * OpenInputFiltersDialogRequest constructor
     */
    public OpenInputFiltersDialogRequest(String inputName, String inputUuid) {
        super("OpenInputFiltersDialog", new Data(inputName, inputUuid));
    }

    /**
     * OpenInputFiltersDialog Request Data
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
         * Name of the input to open the dialog of
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input to open the dialog of
         */
        @JsonProperty("inputUuid")
        private String inputUuid;
    }
}
