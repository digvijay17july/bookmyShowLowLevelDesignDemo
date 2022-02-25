package com.bookmyShowLowLevelDesignDemo.repository;

import com.bookmyShowLowLevelDesignDemo.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, UUID> {
}
