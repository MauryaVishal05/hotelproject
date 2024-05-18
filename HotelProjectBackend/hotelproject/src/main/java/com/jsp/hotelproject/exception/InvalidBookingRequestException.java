package com.jsp.hotelproject.exception;

public class InvalidBookingRequestException extends RuntimeException {
	
	public InvalidBookingRequestException(String message) {
		super(message);
	}

}
