package com.github.egorovna26.obs_remote_control.message.requestresponse.config;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Removes a profile. If the current profile is chosen, it will change to a different profile first.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class RemoveProfileResponse extends RequestResponse<Void> {
}
