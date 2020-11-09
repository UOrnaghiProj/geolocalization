package com.freeinfo.mediaw.geolocalization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.freeinfo.mediaw.geolocalization.connector.OpenCageDatqaFeignClient;
import com.freeinfo.mediaw.geolocalization.model.Location;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class LocationService {
	
	private String nazione;
	private String token;
	
	@Autowired
	private OpenCageDatqaFeignClient feignClient;
	
	public LocationService(
			@Value("${client.opencagedata.nazione}") String nazione,
			@Value("${client.opencagedata.token}") String token) {
		
		this.nazione = nazione;
		this.token = token;
		
	}
	
	
	public Location retriveLocation(String location) {
		log.info("***** Ricerca della location: " + location);
		return feignClient.searchLocationByName(location, nazione, token);
	}

}
