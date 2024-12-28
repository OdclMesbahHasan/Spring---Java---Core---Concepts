package com.mesbah.javacoreconcepts.singletonClass;

public class SingletonThreadSafe {
    // Volatile keyword ensures visibility and prevents reordering in multi-threaded environments
    private static volatile SingletonThreadSafe instance;

    // Private constructor to prevent instantiation
    private SingletonThreadSafe() {
        System.out.println("Thread-Safe Singleton instance created!");
    }

    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        //if instantiated, just return that(Created once in lifetime)
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Thread-Safe Singleton!");
    }


}

//Thread 1 <----> CPU <----> Cache <----> R
                                        //A
//Thread 2 <----> CPU <----> Cache <----> M

//While using volatile keyword, both thread directly reads from RAM, not from cache, thus consistency maintained