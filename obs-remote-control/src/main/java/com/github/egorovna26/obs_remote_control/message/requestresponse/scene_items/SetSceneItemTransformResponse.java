package com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the transform and crop info of a scene item.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetSceneItemTransformResponse extends RequestResponse<Void> {
}
