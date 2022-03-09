package com.lumaivzqz.sfgpetclinic.services;

import com.lumaivzqz.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(final Long id);

    Vet save(final Vet pet);

    Set<Vet> findAll();
}
