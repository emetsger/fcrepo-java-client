package org.fcrepo.client;

/**
 *
 */
public enum HttpHeaders {

    CONTENT_DISPOSITION("Content-Disposition"),
    CONTENT_TYPE("Content-Type"),
    SLUG("Slug"),
    DIGEST("Digest");

    private String headerName;

    private String value;

    HttpHeaders(String headerName) {
        this.headerName = headerName;
    }

    public HttpHeaders setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return value;
    }

}
