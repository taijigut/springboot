package hello.enums;

public enum HelloErrorCode {
	DEFAULT(1, "default error")
	, CUSTOM(2, "custom error")
	;

	private int code;
	private String message;

	private HelloErrorCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int code() {
		return code;
	}

	public String message() {
		return message;
	}

	public static HelloErrorCode codeOf(int errorCode) {
		for (HelloErrorCode code : values()) {
			if(code.code == errorCode) return code;
		}
		return null;
	}	
}
