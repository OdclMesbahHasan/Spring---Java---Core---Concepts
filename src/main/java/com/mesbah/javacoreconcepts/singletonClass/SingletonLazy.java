package com.mesbah.javacoreconcepts.singletonClass;

public class SingletonLazy {
    // Instance created only when accessed
    private static SingletonLazy instance;

    // Private constructor
    private SingletonLazy() {
        System.out.println("Lazy Singleton instance created!");
    }

    // Public method to access the instance
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }

}
