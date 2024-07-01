package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Presses a button in the properties of an input.
 *
 * Some known `propertyName` values are:
 *
 * - `refreshnocache` - Browser source reload button
 *
 * Note: Use this in cases where there is a button in the properties of an input that cannot be accessed in any other way. For example, browser sources, where there is a refresh button.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class PressInputPropertiesButtonResponse extends RequestResponse<Void> {
}
