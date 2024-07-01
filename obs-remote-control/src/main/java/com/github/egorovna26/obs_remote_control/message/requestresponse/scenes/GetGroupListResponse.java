package com.github.egorovna26.obs_remote_control.message.requestresponse.scenes;

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
 * Gets an array of all groups in OBS.
 *
 * Groups in OBS are actually scenes, but renamed and modified. In obs-websocket, we treat them as scenes where we can.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetGroupListResponse extends RequestResponse<GetGroupListResponse.Data> {
    /**
     * @return Array of group names
     */
    public Object getGroups() {
        return getData().getResponseData().getGroups();
    }

    /**
     * GetGroupList Request Response Data
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
         * Array of group names
         */
        @JsonProperty("groups")
        private Object groups;
    }
}
