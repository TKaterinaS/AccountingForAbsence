package tokan.com.btlab;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class BtLabApplication {
    public static void main(String[] args) {

        SpringApplication.run(BtLabApplication.class, args);
    }

}
