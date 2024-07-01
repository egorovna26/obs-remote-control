package com.github.egorovna26.obs_remote_control.message.requestresponse.filters;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the enable state of a source filter.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetSourceFilterEnabledResponse extends RequestResponse<Void> {
}
