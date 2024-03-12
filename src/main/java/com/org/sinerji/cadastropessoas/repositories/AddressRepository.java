package com.org.sinerji.cadastropessoas.repositories;

import com.org.sinerji.cadastropessoas.models.Address;
import com.org.sinerji.cadastropessoas.models.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AddressRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Address byId(Long id){
        return entityManager.find(Address.class, id);
    }

    public List<Address> listAll(){
        return entityManager.createQuery("from Address ", Address.class).getResultList();
    }

    public Address insert(Address address){
        return entityManager.merge(address);
    }

    public void remove(Address address){
        address = byId(address.getId());
        entityManager.remove(address);
    }
}
