package com.example.inix.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inix.inventoryservice.entity.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {

}
