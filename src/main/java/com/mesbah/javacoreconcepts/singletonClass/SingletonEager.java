package com.mesbah.javacoreconcepts.singletonClass;

public class SingletonEager {
    // Single instance created at the time of class loading
    private static final SingletonEager INSTANCE = new SingletonEager();

    // Private constructor to prevent instantiation
    private SingletonEager() {
        System.out.println("Inside Singleton => Eager Singleton instance created");
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }


}
