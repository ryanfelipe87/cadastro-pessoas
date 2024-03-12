package com.org.sinerji.cadastropessoas.repositories;

import com.org.sinerji.cadastropessoas.models.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Person byId(Long id){
        return entityManager.find(Person.class, id);
    }

    public List<Person> listAll(){
        return entityManager.createQuery("from Person", Person.class).getResultList();
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }

    public void remove(Person person){
        person = byId(person.getId());
        entityManager.remove(person);
    }
}
