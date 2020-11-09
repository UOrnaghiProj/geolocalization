package com.freeinfo.mediaw.geolocalization.model;

import lombok.Data;

@Data
public class Result {
	
    private Annotations annotations;
    private Bounds bounds;
    private Components components;
    private int confidence;
    private String formatted;
    private Geometry geometry;

}
