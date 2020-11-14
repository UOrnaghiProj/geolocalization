package com.freeinfo.mediaw.geolocalization.exception;


public class OpencagedataException extends Exception {

	private static final long serialVersionUID = -7543779103958187961L;
	
	private String messaggio = "Errore riportato dal servizio Opencagedata";

	public OpencagedataException() {
		
	}
	
	public OpencagedataException(String messaggio) {
		super();
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

}
