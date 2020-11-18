package at.itkolleg.test1.Service;

import at.itkolleg.test1.Model.Invoice;
import at.itkolleg.test1.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService{
    @Autowired
    private InvoiceRepository repo;

    public List<Invoice> findAll() {
        return repo.findAll();
    }

    public List<Invoice> findAll(Sort sort) {
        return repo.findAll(sort);
    }

    public Page<Invoice> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public List<Invoice> findAllById(Iterable<Long> iterable) {
        return repo.findAllById(iterable);
    }

    public long count() {
        return repo.count();
    }

    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    public void delete(Invoice invoice) {
        repo.delete(invoice);
    }

    public void deleteAll(Iterable<? extends Invoice> iterable) {
        repo.deleteAll(iterable);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public <S extends Invoice> S save(S s) {
        return repo.save(s);
    }

    public <S extends Invoice> List<S> saveAll(Iterable<S> iterable) {
        return repo.saveAll(iterable);
    }

    public Optional<Invoice> findById(Long aLong) {
        return repo.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    public void flush() {
        repo.flush();
    }

    public <S extends Invoice> S saveAndFlush(S s) {
        return repo.saveAndFlush(s);
    }

    public void deleteInBatch(Iterable<Invoice> iterable) {
        repo.deleteInBatch(iterable);
    }

    public void deleteAllInBatch() {
        repo.deleteAllInBatch();
    }

    public Invoice getOne(Long aLong) {
        return repo.getOne(aLong);
    }

    public <S extends Invoice> Optional<S> findOne(Example<S> example) {
        return repo.findOne(example);
    }

    public <S extends Invoice> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    public <S extends Invoice> List<S> findAll(Example<S> example, Sort sort) {
        return repo.findAll(example, sort);
    }

    public <S extends Invoice> Page<S> findAll(Example<S> example, Pageable pageable) {
        return repo.findAll(example, pageable);
    }
    public <S extends Invoice> long count(Example<S> example) {
        return repo.count();
    }

    public <S extends Invoice> boolean exists(Example<S> example) {
        return repo.exists(example);
    }
}
