package at.itkolleg.test1.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private long id;
    private long num;
    private Date date;
    private double sum;
    @ManyToOne
    private Customer customer;
}
