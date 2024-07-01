package com.github.egorovna26.obs_remote_control.message.requestresponse.filters;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the name of a source filter (rename).
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetSourceFilterNameResponse extends RequestResponse<Void> {
}
