package com.delta.airlines.Service;

import java.util.List;

import com.delta.airlines.DTO.DeltaDTO;

public interface DeltaService {

	List<DeltaDTO> getFlightInfo();

	DeltaDTO getFlightInfoById(Long id);

	void insertData();

	DeltaDTO getFlightInfoByName(String flightKey);

	void postData(DeltaDTO dto);

}
