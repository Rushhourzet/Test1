package at.itkolleg.test1.Controller;

import at.itkolleg.test1.Model.Customer;
import at.itkolleg.test1.Model.Invoice;
import at.itkolleg.test1.Service.CustomerService;
import at.itkolleg.test1.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityExistsException;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    private CustomerService cService;
    @Autowired
    private InvoiceService iService;

    public String viewInvoicesByCustomerId(Iterable<Long> id) {
        List<Customer> customers = cService.findAllById(id);
        String out = "";
        for (Customer c: customers) {
            out += "Customer " + c.getFirstname() + " " + c.getLastname() + "has the invoices:";
            out += c.getInvoices();
        }
        return out;
    }

    public boolean addCustomer(Customer c) throws Exception {
        if(!cService.existsById(c.getId())){
            cService.save(c);
            return true;
        }
        throw new EntityExistsException("Customer already exists!");
    }
}
