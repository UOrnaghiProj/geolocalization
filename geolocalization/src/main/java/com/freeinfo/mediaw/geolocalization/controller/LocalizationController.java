package com.freeinfo.mediaw.geolocalization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeinfo.mediaw.geolocalization.exception.OpencagedataException;
import com.freeinfo.mediaw.geolocalization.model.Location;
import com.freeinfo.mediaw.geolocalization.service.LocationService;

@RestController
@RequestMapping(value = "/geolocalize")
public class LocalizationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping(value = "/location/{location}")
	public ResponseEntity<Location> getLocation(@PathVariable("location") String location) throws OpencagedataException{
		return new ResponseEntity<Location>(locationService.retriveLocation(location),HttpStatus.OK);
	}

}
