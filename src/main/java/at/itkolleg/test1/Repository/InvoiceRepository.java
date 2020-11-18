package at.itkolleg.test1.Repository;

import at.itkolleg.test1.Model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
