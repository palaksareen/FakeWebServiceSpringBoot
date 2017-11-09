package uk.co.o2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication

public class ShieldApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShieldApplication.class, args);
    }
}
