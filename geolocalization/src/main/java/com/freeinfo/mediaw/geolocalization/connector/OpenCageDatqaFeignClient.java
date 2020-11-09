package com.freeinfo.mediaw.geolocalization.connector;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.freeinfo.mediaw.geolocalization.model.Location;

@FeignClient(name="opencagedate", url = "${client.opencagedata.base_url}")
public interface OpenCageDatqaFeignClient {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Location searchLocationByName(
            @RequestParam("q") String location,
            @RequestParam("countrycode") String nazione,
            @RequestParam("key") String token
    );
}