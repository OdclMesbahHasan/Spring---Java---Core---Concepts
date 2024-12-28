package com.mesbah.javacoreconcepts;

import com.mesbah.javacoreconcepts.inversionOfControl.GP;
import com.mesbah.javacoreconcepts.inversionOfControl.Robi;
import com.mesbah.javacoreconcepts.inversionOfControl.Sim;
import com.mesbah.javacoreconcepts.singletonClass.SingletonEager;
import com.mesbah.javacoreconcepts.singletonClass.SingletonEnum;
import com.mesbah.javacoreconcepts.singletonClass.SingletonLazy;
import com.mesbah.javacoreconcepts.singletonClass.SingletonThreadSafe;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCoreConceptsApplication {
    static public void main(String[] args) {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

//        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
//        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();
//        SingletonLazy instance1 = SingletonLazy.getInstance();
//        SingletonLazy instance2 = SingletonLazy.getInstance();
//        SingletonEager instance1 = SingletonEager.getInstance();
//        SingletonEager instance2 = SingletonEager.getInstance();

        instance1.showMessage();
        instance2.showMessage();

        if (instance1 == instance2) {
            System.out.println("Both references point to the same instance (Eager).");
        } else {
            System.out.println("Different instances exist!");
        }

//        Sim sim = new Robi();//Declaring objects of interface, thus we no longer need to change here the entire code, configure this line only
//        sim.calling();
//        sim.data();
//        SpringApplication.run(JavaCoreConceptsApplication.class, args);
    }

}
