package at.itkolleg.test1.Service;

import at.itkolleg.test1.Model.Customer;
import at.itkolleg.test1.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public List<Customer> findAll() {
        return repo.findAll();
    }

    public List<Customer> findAll(Sort sort) {
        return repo.findAll(sort);
    }

    public Page<Customer> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public List<Customer> findAllById(Iterable<Long> iterable) {
        return repo.findAllById(iterable);
    }

    public long count() {
        return repo.count();
    }

    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    public void delete(Customer customer) {
        repo.delete(customer);
    }

    public void deleteAll(Iterable<? extends Customer> iterable) {
        repo.deleteAll(iterable);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public <S extends Customer> S save(S s) {
        return repo.save(s);
    }

    public <S extends Customer> List<S> saveAll(Iterable<S> iterable) {
        return repo.saveAll(iterable);
    }

    public Optional<Customer> findById(Long aLong) {
        return repo.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    public void flush() {
        repo.flush();
    }

    public <S extends Customer> S saveAndFlush(S s) {
        return repo.saveAndFlush(s);
    }

    public void deleteInBatch(Iterable<Customer> iterable) {
        repo.deleteInBatch(iterable);
    }

    public void deleteAllInBatch() {
        repo.deleteAllInBatch();
    }

    public Customer getOne(Long aLong) {
        return repo.getOne(aLong);
    }

    public <S extends Customer> Optional<S> findOne(Example<S> example) {
        return repo.findOne(example);
    }

    public <S extends Customer> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
        return repo.findAll(example, sort);
    }

    public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return repo.findAll(example, pageable);
    }
    public <S extends Customer> long count(Example<S> example) {
        return repo.count();
    }

    public <S extends Customer> boolean exists(Example<S> example) {
        return repo.exists(example);
    }
}
