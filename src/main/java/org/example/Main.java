package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.Timestamp;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String randomString = RandomStringUtils.randomAlphanumeric(10);
            System.out.println(new Timestamp(new Date().getTime()) + " : " + randomString);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}