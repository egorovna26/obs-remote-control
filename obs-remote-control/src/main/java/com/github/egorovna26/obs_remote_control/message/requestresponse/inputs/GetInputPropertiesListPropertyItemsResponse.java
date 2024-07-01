package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.Object;
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
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetInputPropertiesListPropertyItemsResponse extends RequestResponse<GetInputPropertiesListPropertyItemsResponse.Data> {
    /**
     * @return Array of items in the list property
     */
    public Object getPropertyItems() {
        return getData().getResponseData().getPropertyItems();
    }

    /**
     * GetInputPropertiesListPropertyItems Request Response Data
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
         * Array of items in the list property
         */
        @JsonProperty("propertyItems")
        private Object propertyItems;
    }
}
