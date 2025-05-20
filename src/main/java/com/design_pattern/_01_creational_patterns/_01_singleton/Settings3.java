package com.design_pattern._01_creational_patterns._01_singleton;

public class Settings3 {

    private static volatile Settings3 instance;

    private Settings3() {}

    // double checked locking
    public static Settings3 getInstance() {
        if (instance == null) {
            synchronized (Settings3.class) {
                if (instance == null) {
                    instance = new Settings3();
                }
            }
        }
        return instance;
    }
}
