package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class quoteApplication {

    @Autowired
    private SeedData seedData;
    
    public static void main(String[] args) {
        SpringApplication.run(quoteApplication.class, args);
	}
}
