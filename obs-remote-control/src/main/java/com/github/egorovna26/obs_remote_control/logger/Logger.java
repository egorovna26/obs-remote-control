package com.github.egorovna26.obs_remote_control.logger;

public interface Logger {
    void info(String message);

    void warn(String message);

    void error(String message, Throwable e);
}
