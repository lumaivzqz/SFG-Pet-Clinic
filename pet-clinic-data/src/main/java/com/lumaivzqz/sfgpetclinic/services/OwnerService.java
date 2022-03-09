package com.lumaivzqz.sfgpetclinic.services;

import com.lumaivzqz.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(final String lastName);

    Owner findById(final Long id);

    Owner save(final Owner owner);

    Set<Owner> findAll();
}
