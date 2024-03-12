package com.org.sinerji.cadastropessoas.services;

import com.org.sinerji.cadastropessoas.models.Person;
import com.org.sinerji.cadastropessoas.repositories.PersonRepository;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonService {

    @PersistenceContext
    private PersonRepository personRepository;

    public void save(Person person) {
        personRepository.insert(person);
    }

    public void delete(Person person) {
        personRepository.remove(person);
    }
}
