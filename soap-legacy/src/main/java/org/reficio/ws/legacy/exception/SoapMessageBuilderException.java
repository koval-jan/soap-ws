package org.reficio.ws.legacy.exception;

public class SoapMessageBuilderException extends RuntimeException {

	private static final long serialVersionUID = -8848542169327505224L;

	public SoapMessageBuilderException() {
		super();
	}

	public SoapMessageBuilderException(String message, Throwable cause) {
		super(message, cause);
	}

	public SoapMessageBuilderException(String message) {
		super(message);
	}

	public SoapMessageBuilderException(Throwable cause) {
		super(cause);
	}

}
