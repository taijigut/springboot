package example.error;

import example.enums.HelloErrorCode;

public class HelloException extends Exception {

	private static final long serialVersionUID = 1L;

	public HelloException(int errorCode, Throwable ex) {
		super(HelloErrorCode.codeOf(errorCode).message(), ex);
	}

}
