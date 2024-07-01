package com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Removes a scene item from a scene.
 *
 * Scenes only
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RemoveSceneItemResponse extends RequestResponse<Void> {
}
