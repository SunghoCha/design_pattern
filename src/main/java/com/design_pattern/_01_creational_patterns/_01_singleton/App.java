package com.design_pattern._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Settings1 instance1 = Settings1.getInstance();
        Settings1 instance2 = Settings1.getInstance();
        System.out.println(instance1 == instance2);

        Constructor<Settings1> constructor = Settings1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings1 settings1 = constructor.newInstance();
        System.out.println(instance1 == settings1);
    }
}
