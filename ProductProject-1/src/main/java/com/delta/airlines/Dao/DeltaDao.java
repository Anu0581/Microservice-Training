package com.delta.airlines.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.airlines.DeltaModel;

public interface DeltaDao extends JpaRepository<DeltaModel, Long>{

	Optional<DeltaModel> findByFlightKey(String flightKey);

}
