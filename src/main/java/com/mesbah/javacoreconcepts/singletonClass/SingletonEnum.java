package com.mesbah.javacoreconcepts.singletonClass;

public enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Enum Singleton!");
    }


}
