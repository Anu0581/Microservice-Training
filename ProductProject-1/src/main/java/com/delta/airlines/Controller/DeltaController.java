package com.delta.airlines.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delta.airlines.DTO.DeltaDTO;
import com.delta.airlines.Service.DeltaService;

@RestController()
public class DeltaController {
	
	@Autowired
	DeltaService deltaService;

	@GetMapping("/search")
	public List<DeltaDTO> getFlightInfo(){
		return deltaService.getFlightInfo();
	}
	
	@GetMapping("/{id}")
	public DeltaDTO getFlightInfoById(@PathVariable Long id){
		return deltaService.getFlightInfoById(id);
	}
	
	@GetMapping("/byName/{flightKey}")
	public DeltaDTO getFlightInfoById(@PathVariable String flightKey){
		return deltaService.getFlightInfoByName(flightKey);
	}
	
	@GetMapping(path="/insertData")
	public List<DeltaDTO> insertData(){
		deltaService.insertData();
		return deltaService.getFlightInfo();
	}
	
	@PostMapping(path="/post")
	public ResponseEntity<String> postData(@RequestBody DeltaDTO dto) {
		deltaService.postData(dto);
		
		return new ResponseEntity<>(
			      "success ",
			      HttpStatus.CREATED);
	}
	
}
