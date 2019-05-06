/* package com.learn.reository;

import com.learn.LearnApplication;
import com.learn.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo {
    private static Logger LOG = LoggerFactory.getLogger(LearnApplication.class);
    @Override
    public void registrar(String nombre) {
        LOG.info("Se registró a " + nombre);
    }

    @Override
    public List<Persona> findAll() {
        return null;
    }

    @Override
    public List<Persona> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Persona> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Persona> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Persona persona) {

    }

    @Override
    public void deleteAll(Iterable<? extends Persona> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Persona> S save(S s) {
        return null;
    }

    @Override
    public <S extends Persona> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Persona> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Persona> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Persona> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Persona getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Persona> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Persona> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Persona> boolean exists(Example<S> example) {
        return false;
    }
}
*/