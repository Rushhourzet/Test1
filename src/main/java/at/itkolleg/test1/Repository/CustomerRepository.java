package at.itkolleg.test1.Repository;

import at.itkolleg.test1.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
