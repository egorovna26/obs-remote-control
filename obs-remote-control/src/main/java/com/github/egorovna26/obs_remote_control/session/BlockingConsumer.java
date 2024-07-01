package com.github.egorovna26.obs_remote_control.session;

import lombok.CustomLog;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@CustomLog
public class BlockingConsumer<T> implements Consumer<T> {
    private final CountDownLatch latch = new CountDownLatch(1);
    private T result;

    @Override
    public void accept(T t) {
        this.result = t;
        this.latch.countDown();
    }

    public T get(long timeout) {
        try {
            if (!this.latch.await(timeout, TimeUnit.MILLISECONDS)) {
                log.warn("Timeout waiting for result");
            }
        } catch (Exception e) {
            log.error("Timeout waiting for result", e);
        }
        return this.result;
    }
}