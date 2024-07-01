package com.github.egorovna26.obs_remote_control;

import com.github.egorovna26.obs_remote_control.logger.Logger;
import com.github.egorovna26.obs_remote_control.logger.LoggerFactory;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import lombok.CustomLog;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

@Getter
@Setter
@CustomLog
public class OBSRemoteControl extends OBSRemoteControlBase {
    private String host = "localhost";
    private int port = 4455;
    private String password = "";

    public void setLogger(Logger logger) {
        LoggerFactory.setLogger(logger);
    }

    public void connect() {
        session.connect(host, port, password);
    }

    public void disconnect() {
        session.disconnect();
        session.shutdown();
    }

    public <T extends Event> void addEventListener(Class<T> cls, Consumer<T> listener) {
        session.addEventListener(cls, listener);
    }

    public <T extends Event> void removeEventListener(Class<T> cls, Consumer<T> listener) {
        session.removeEventListener(cls, listener);
    }
}
