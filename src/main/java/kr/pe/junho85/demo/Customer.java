package kr.pe.junho85.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@ToString
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Type(type="yes_no")
    private boolean testYN;

    protected Customer() {
    }

    public Customer(String firstName, String lastName, boolean testYN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testYN = testYN;
    }

}
