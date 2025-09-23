package com.fittrack.exception;

public class CustomException extends RuntimeException {
    private String message;
    private int errorCode;

    public CustomException(String message, int errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
