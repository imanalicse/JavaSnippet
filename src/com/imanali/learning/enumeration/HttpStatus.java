package com.imanali.learning.enumeration;

public enum HttpStatus {
    OK(200, "Ok"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    BAD_REQUEST(400, "Bad Request"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found")
    ;

    private final int code;
    private final String reasonPhrase;

    private HttpStatus(int code, String reasonPhrase) {
        this.code = code;
        this.reasonPhrase = reasonPhrase;
    }

    public int code() {
        return this.code;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }
}
