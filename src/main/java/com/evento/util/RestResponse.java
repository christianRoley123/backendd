package com.evento.util;

public class RestResponse {

	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public RestResponse(Integer responseCode, String message) {
		super();
		this.responseCode = responseCode;
		this.message = message;
	}
	public RestResponse(Integer responseCode) {
		super();
		this.responseCode = responseCode;
			
	}
	private Integer responseCode;
	private String message;
}
