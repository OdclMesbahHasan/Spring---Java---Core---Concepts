package com.mesbah.javacoreconcepts;

import com.mesbah.javacoreconcepts.inversionOfControl.GP;
import com.mesbah.javacoreconcepts.inversionOfControl.Robi;
import com.mesbah.javacoreconcepts.inversionOfControl.Sim;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCoreConceptsApplication {
    public static void main(String[] args) {
        Sim sim = new Robi();//Declaring objects of interface, thus we no longer need to change here the entire code, configure this line only
        sim.calling();
        sim.data();
//        SpringApplication.run(JavaCoreConceptsApplication.class, args);
    }

}
