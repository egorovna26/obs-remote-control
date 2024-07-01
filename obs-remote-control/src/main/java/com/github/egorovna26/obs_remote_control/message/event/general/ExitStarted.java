package com.github.egorovna26.obs_remote_control.message.event.general;

import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.lang.Void;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * OBS has begun the shutdown process.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ExitStarted extends Event<Void> {
}
