package com.freeinfo.mediaw.geolocalization.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class GeoExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(OpencagedataException.class)
	public ResponseEntity<ErrorResponse> setOpencageException(OpencagedataException ex){
		
		ErrorResponse err = new ErrorResponse();
		err.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		err.setDate(java.time.LocalTime.now());
		err.setMessage(ex.getMessaggio());
		
		return new ResponseEntity<ErrorResponse>(err, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
