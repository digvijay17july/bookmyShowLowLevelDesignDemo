package com.bookmyShowLowLevelDesignDemo.repository;

import com.bookmyShowLowLevelDesignDemo.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */

@Repository
public interface TicketRepository extends CrudRepository<Ticket, UUID> {
}
