package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Creates a new scene collection, switching to it in the process.
 *
 * Note: This will block until the collection has finished changing.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateSceneCollectionResponse extends RequestResponse<Void> {
}
