package com.github.egorovna26.obs_remote_control.message.requestresponse.filters;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Creates a new filter, adding it to the specified source.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class CreateSourceFilterResponse extends RequestResponse<Void> {
}
