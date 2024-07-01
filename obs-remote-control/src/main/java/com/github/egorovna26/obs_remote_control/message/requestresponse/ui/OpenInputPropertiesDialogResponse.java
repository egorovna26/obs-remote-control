package com.github.egorovna26.obs_remote_control.message.requestresponse.ui;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Opens the properties dialog of an input.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class OpenInputPropertiesDialogResponse extends RequestResponse<Void> {
}
