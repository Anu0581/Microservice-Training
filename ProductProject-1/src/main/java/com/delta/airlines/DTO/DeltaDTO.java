package com.delta.airlines.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeltaDTO {

	private String flightKey;
	private Date flightDate;
	private String origin;
	private String destination;
}
