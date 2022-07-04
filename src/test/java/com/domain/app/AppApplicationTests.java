package com.domain.app;

import org.fluttercode.datafactory.impl.DataFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

    @Test
    void contextLoads() {

        DataFactory df = new DataFactory();
        for (int i = 0; i < 100; i++) {
            String name = df.getFirstName() + " "+ df.getLastName();
            System.out.println(name);
        }
    }

}
