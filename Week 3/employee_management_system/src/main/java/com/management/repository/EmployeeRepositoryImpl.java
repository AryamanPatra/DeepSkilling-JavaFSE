package com.management.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import com.management.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllInBatch(Iterable<Employee> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee getOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee getReferenceById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Employee> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Employee> findAllById(Iterable<Long> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> S save(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Optional<Employee> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean existsById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Employee> findAll(Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> long count(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <S extends Employee, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
