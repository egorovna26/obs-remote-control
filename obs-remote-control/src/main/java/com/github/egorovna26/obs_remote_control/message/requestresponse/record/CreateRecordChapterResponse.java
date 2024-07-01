package com.github.egorovna26.obs_remote_control.message.requestresponse.record;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Adds a new chapter marker to the file currently being recorded.
 *
 * Note: As of OBS 30.2.0, the only file format supporting this feature is Hybrid MP4.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateRecordChapterResponse extends RequestResponse<Void> {
}
