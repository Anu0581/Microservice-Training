package com.delta.airlines.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delta.airlines.DeltaModel;
import com.delta.airlines.DTO.DeltaDTO;
import com.delta.airlines.Dao.DeltaDao;

@Service
public class DeltaServiceImpl implements DeltaService{
	
	@Autowired
	DeltaDao deltaDao;

	@Override
	public List<DeltaDTO> getFlightInfo() {
		return deltaDao.findAll().stream().map(info->{
			DeltaDTO dto = new DeltaDTO();
			BeanUtils.copyProperties(info, dto);
			return dto;
		}).collect(Collectors.toList());
		 
	}

	@Override
	public DeltaDTO getFlightInfoById(Long id) {
		DeltaDTO dto = new DeltaDTO();
		BeanUtils.copyProperties(deltaDao.findById(id).get(), dto);
		return dto;
	}

	@Override
	//@PostConstruct 
	public void insertData() {
		deltaDao.save(DeltaModel.builder().flightKey("SQ1234")
				.destination("DEL")
				.origin("SIN")
				.flightDate(new Date())
				.build());
		
	}

	@Override
	public DeltaDTO getFlightInfoByName(String flightKey) {
		DeltaDTO dto = new DeltaDTO();
		BeanUtils.copyProperties(deltaDao.findByFlightKey(flightKey).get(), dto);
		return dto;
	}

	@Override
	public void postData(DeltaDTO dto) {
		DeltaModel model = new DeltaModel();
		BeanUtils.copyProperties(dto, model);
		deltaDao.save(model);
		
	}

	

}
