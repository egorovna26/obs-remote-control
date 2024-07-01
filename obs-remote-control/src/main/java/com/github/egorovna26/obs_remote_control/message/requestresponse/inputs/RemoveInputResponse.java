package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Removes an existing input.
 *
 * Note: Will immediately remove all associated scene items.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RemoveInputResponse extends RequestResponse<Void> {
}
