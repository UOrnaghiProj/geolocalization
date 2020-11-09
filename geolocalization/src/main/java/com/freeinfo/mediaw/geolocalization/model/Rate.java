package com.freeinfo.mediaw.geolocalization.model;

import lombok.Data;

@Data
public class Rate {

    private int limit;
    private int remaining;
    private int reset;
	
}
