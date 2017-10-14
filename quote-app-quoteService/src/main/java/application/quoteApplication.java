package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class quoteApplication {

    @Autowired
    private SeedData seedData;
    
    public static void main(String[] args) {
        SpringApplication.run(quoteApplication.class, args);
	}
}
