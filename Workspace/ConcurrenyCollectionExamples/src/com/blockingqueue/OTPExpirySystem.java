package com.blockingqueue;

import java.util.concurrent.DelayQueue;

public class OTPExpirySystem {

    public static void main(String[] args)
            throws Exception {

        DelayQueue<OTP> queue =
                new DelayQueue<>();

        queue.put(new OTP("OTP-1234", 5));

        System.out.println("OTP Generated");

        System.out.println("Waiting for Expiry...");

        // waits 5 seconds
        System.out.println(
                "Expired OTP: " + queue.take());
    }
}

