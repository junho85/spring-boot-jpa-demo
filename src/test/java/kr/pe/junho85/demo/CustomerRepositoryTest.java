package kr.pe.junho85.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void test() {
        Iterable<Customer> all = customerRepository.findAll();
        for (Customer customer : all) {
            System.out.println(customer);
        }
    }

}