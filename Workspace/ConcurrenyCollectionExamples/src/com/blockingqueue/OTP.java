package com.blockingqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class OTP implements Delayed {

    private String code;
    private long expiryTime;

    public OTP(String code, long delaySeconds) {

        this.code = code;

        this.expiryTime =
                System.currentTimeMillis()
                        + delaySeconds * 1000;
    }

    @Override
    public long getDelay(TimeUnit unit) {

        long diff =
                expiryTime - System.currentTimeMillis();

        return unit.convert(diff,
                TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed d) {

        return Long.compare(
                this.expiryTime,
                ((OTP) d).expiryTime);
    }

    @Override
    public String toString() {

        return code;
    }
}


