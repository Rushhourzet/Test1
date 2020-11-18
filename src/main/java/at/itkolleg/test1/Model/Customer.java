package at.itkolleg.test1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String lastname;
    private String firstname;
    @OneToMany
    private Set<Invoice> invoices;
}
