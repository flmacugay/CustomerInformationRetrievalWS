package com.mac.exception;

/**
 * 
 * @author Froilan
 *
 */
public class InvalidInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorDetail;

	public InvalidInputException(String err, String errorDetail) {
		super(err);
		this.errorDetail=errorDetail;
	}

	public String getErrorDetail() {
		return errorDetail;
	}
	
}
