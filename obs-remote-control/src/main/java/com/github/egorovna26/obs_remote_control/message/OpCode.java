package com.github.egorovna26.obs_remote_control.message;

import com.github.egorovna26.obs_remote_control.message.hello.Hello;
import com.github.egorovna26.obs_remote_control.message.identified.Identified;
import com.github.egorovna26.obs_remote_control.message.identify.Identify;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public enum OpCode {
    HELLO(0, Hello.class),
    IDENTIFY(1, Identify.class),
    IDENTIFIED(2, Identified.class),
    EVENT(5, Event.class),
    REQUEST(6, Request.class),
    REQUEST_RESPONSE(7, RequestResponse.class);

    private final int op;
    private final Class<? extends Message> messageClass;

    public static OpCode find(int op) {
        for (OpCode value : OpCode.values()) {
            if (value.getOp() == op) {
                return value;
            }
        }
        return null;
    }
}
