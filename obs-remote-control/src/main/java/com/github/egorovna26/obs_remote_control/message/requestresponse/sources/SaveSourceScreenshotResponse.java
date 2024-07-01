package com.github.egorovna26.obs_remote_control.message.requestresponse.sources;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Saves a screenshot of a source to the filesystem.
 *
 * The `imageWidth` and `imageHeight` parameters are treated as "scale to inner", meaning the smallest ratio will be used and the aspect ratio of the original resolution is kept.
 * If `imageWidth` and `imageHeight` are not specified, the compressed image will use the full resolution of the source.
 *
 * **Compatible with inputs and scenes.**
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SaveSourceScreenshotResponse extends RequestResponse<Void> {
}
