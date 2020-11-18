package at.itkolleg.test1.Controller;

import at.itkolleg.test1.Model.Customer;
import at.itkolleg.test1.Model.Invoice;
import at.itkolleg.test1.Service.CustomerService;
import at.itkolleg.test1.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Set;

@Controller
public class AppController {
    @Autowired
    private CustomerService cService;
    @Autowired
    private InvoiceService iService;

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List getAllCustomers() {
        return cService.findAll();
    }
    @RequestMapping(value = "/invoices", method = RequestMethod.GET)
    public List getAllInvoices() {
        return iService.findAll();
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable Long id) {
        return cService.getOne(id);
    }

    @RequestMapping(value = "/invoices/{id}", method = RequestMethod.GET)
    public Invoice getInvoices(@PathVariable Long id) {
        return iService.getOne(id);
    }

    @RequestMapping(value = "/customers", method =RequestMethod.POST)
    public void addCustomer(@RequestBody Customer c) {
        cService.save(c);
    }
    @RequestMapping(value = "/invoices", method =RequestMethod.POST)
    public void addInvoice(@RequestBody Invoice i) {
        iService.save(i);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer c,@PathVariable Long id) {
        cService.updateById(c, id);
    }
    @RequestMapping(value = "/invoices/{id}", method = RequestMethod.PUT)
    public void deleteInvoice(@RequestBody Invoice i,@PathVariable Long id) {
        iService.updateById(i, id);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable Long id) {
        cService.deleteById(id);
    }
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public void deleteInvoice(@PathVariable Long id) {
        iService.deleteById(id);
    }
}
