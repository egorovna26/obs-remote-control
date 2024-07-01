package com.github.egorovna26.obs_remote_control.message.requestresponse.record;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Pauses the record output.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class PauseRecordResponse extends RequestResponse<Void> {
}
