package com.nutrition.Exception;

public class NutricionistaException extends Exception{

	private static final long serialVersionUID = 1L;

	public NutricionistaException() {
		super();
		
	}

	public NutricionistaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public NutricionistaException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NutricionistaException(String message) {
		super(message);
		
	}

	public NutricionistaException(Throwable cause) {
		super(cause);
		
	}

}
