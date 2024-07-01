package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sets the value of a parameter in the current profile's configuration.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SetProfileParameterResponse extends RequestResponse<Void> {
}
