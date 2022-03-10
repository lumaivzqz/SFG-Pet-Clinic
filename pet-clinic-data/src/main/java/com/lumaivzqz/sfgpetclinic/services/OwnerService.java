package com.lumaivzqz.sfgpetclinic.services;

import com.lumaivzqz.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(final String lastName);

}
