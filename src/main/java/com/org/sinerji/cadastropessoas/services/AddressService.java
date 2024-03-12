package com.org.sinerji.cadastropessoas.services;

import com.org.sinerji.cadastropessoas.models.Address;
import com.org.sinerji.cadastropessoas.repositories.AddressRepository;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

@Stateless
public class AddressService {

    @PersistenceContext
    private AddressRepository addressRepository;

    public void save(Address address) {
        addressRepository.insert(address);
    }

    public void delete(Address address) {
        addressRepository.remove(address);
    }
}
