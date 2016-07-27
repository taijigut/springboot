package hello.error;

import hello.enums.HelloErrorCode;

public class HelloException extends Exception {

	public HelloException(int errorCode, Throwable ex) {
		super(HelloErrorCode.codeOf(errorCode).message(), ex);
	}

}
