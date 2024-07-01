package com.github.egorovna26.obs_remote_control.logger;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LoggerFactory {
    @Getter
    @Setter
    private static Logger logger = new EmptyLogger();
}
