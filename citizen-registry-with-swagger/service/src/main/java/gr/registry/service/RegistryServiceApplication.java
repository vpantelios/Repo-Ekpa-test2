package gr.registry.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/** Εκκίνηση RESTful υπηρεσίας μητρώου πολιτών. */
@SpringBootApplication(scanBasePackages = "gr.registry")
@EntityScan(basePackages = "gr.registry.domain")
public class RegistryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceApplication.class, args);
    }
}
