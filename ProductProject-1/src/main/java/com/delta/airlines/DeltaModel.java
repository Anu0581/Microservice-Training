package com.delta.airlines;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="delta")
@Builder
public class DeltaModel {
	
	@Id
	@GeneratedValue
	private Long flightId;
	private String flightKey;
	private Date flightDate;
	private String origin;
	private String destination;

}
