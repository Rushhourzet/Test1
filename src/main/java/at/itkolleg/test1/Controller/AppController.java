package at.itkolleg.test1.Controller;

import at.itkolleg.test1.Model.Customer;
import at.itkolleg.test1.Model.Invoice;
import at.itkolleg.test1.Service.CustomerService;
import at.itkolleg.test1.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Set;

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

    public void addCustomer(Customer c) throws Exception {
        if(!cService.existsById(c.getId())){
            cService.save(c);
        } else{
            throw new EntityExistsException("Customer already exists!");
        }
    }

    public void addInvoice(Customer c, Invoice i){
        Set<Invoice> invoices = c.getInvoices();
        if(invoices.stream().anyMatch(id -> id.getId() != i.getId())){
            invoices.add(i);
            c.setInvoices(invoices);
        }
        else{
            throw new EntityExistsException("Invoice already exists!");
        }
    }

    public Customer getCustomerById(Long id){
        return cService.getOne(id);
    }
    public Invoice getInvoiceById(Long id){
        return iService.getOne(id);
    }

    public void changeCustomerById(Long id, Customer cNew){
        Customer cOld = getCustomerById(id);
        cService.deleteById(id);
        cService.save(cNew);
    }
    public void changeInvoiceById(Long id, Invoice iNew){
        Customer iOld = getCustomerById(id);
        iService.deleteById(id);
        iService.save(iNew);
    }

    public void deleteCustomerById(Long id){
        cService.deleteById(id);
    }
    public void deleteInvoiceById(Long id){
        iService.deleteById(id);
    }
}
