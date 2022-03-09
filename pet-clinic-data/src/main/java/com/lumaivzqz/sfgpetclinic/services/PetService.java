package com.lumaivzqz.sfgpetclinic.services;

import com.lumaivzqz.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(final Long id);

    Pet save(final Pet pet);

    Set<Pet> findAll();
}
