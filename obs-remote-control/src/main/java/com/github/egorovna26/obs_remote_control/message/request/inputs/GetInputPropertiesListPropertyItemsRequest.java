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
 * Gets the items of a list property from an input's properties.
 *
 * Note: Use this in cases where an input provides a dynamic, selectable list of items. For example, display capture, where it provides a list of available displays.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputPropertiesListPropertyItemsRequest extends Request<GetInputPropertiesListPropertyItemsRequest.Data> {
    /**
     * GetInputPropertiesListPropertyItemsRequest constructor
     */
    public GetInputPropertiesListPropertyItemsRequest(String inputName, String inputUuid,
            String propertyName) {
        super("GetInputPropertiesListPropertyItems", new Data(inputName, inputUuid, propertyName));
    }

    /**
     * GetInputPropertiesListPropertyItems Request Data
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
         * Name of the input
         */
        @JsonProperty("inputName")
        private String inputName;

        /**
         * UUID of the input
         */
        @JsonProperty("inputUuid")
        private String inputUuid;

        /**
         * Name of the list property to get the items of
         */
        @JsonProperty("propertyName")
        private String propertyName;
    }
}
