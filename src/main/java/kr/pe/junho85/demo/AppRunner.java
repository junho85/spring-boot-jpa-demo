package kr.pe.junho85.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppRunner implements ApplicationRunner {
    CustomerRepository repository;

    public AppRunner(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // save a few customers
        repository.save(new Customer("Jack2", "Bauer2", true));
//        repository.save(new Customer("Chloe", "O'Brian"));
//        repository.save(new Customer("Kim", "Bauer"));
//        repository.save(new Customer("David", "Palmer"));
//        repository.save(new Customer("Michelle", "Dessler"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch on individual customer by ID
        Customer customer = repository.findById(1);
        log.info("Customer found with findById(1L):");
        log.info("--------------------------------");
        log.info(customer.toString());
        log.info("");

        // fetch customers by last name
        log.info("Customer found with findByLastName('Bauer'):");
        log.info("--------------------------------------------");
        repository.findByLastName("Bauer").forEach(bauer -> {
            log.info(bauer.toString());
        });
        log.info("");
    }
}
