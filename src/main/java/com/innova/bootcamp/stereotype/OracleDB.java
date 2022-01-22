package com.innova.bootcamp.stereotype;

@InnovaMultipleAnnotation
public class OracleDB {
	
	private String url = "jdbc:oracle:thin:@[HOST][:PORT]:SID";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
