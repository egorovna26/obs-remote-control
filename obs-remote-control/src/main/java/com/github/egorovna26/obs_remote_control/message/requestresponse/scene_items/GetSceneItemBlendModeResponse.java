package com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items;

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
 * Gets the blend mode of a scene item.
 *
 * Blend modes:
 *
 * - `OBS_BLEND_NORMAL`
 * - `OBS_BLEND_ADDITIVE`
 * - `OBS_BLEND_SUBTRACT`
 * - `OBS_BLEND_SCREEN`
 * - `OBS_BLEND_MULTIPLY`
 * - `OBS_BLEND_LIGHTEN`
 * - `OBS_BLEND_DARKEN`
 *
 * Scenes and Groups
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSceneItemBlendModeResponse extends RequestResponse<GetSceneItemBlendModeResponse.Data> {
    /**
     * @return Current blend mode
     */
    public String getSceneItemBlendMode() {
        return getData().getResponseData().getSceneItemBlendMode();
    }

    /**
     * GetSceneItemBlendMode Request Response Data
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
         * Current blend mode
         */
        @JsonProperty("sceneItemBlendMode")
        private String sceneItemBlendMode;
    }
}
