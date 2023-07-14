package com.ninos.model.enumeration;

public enum Scope {

    USER("USER"),
    ORGANIZATION("ORGANIZATION");

    private String value;

    Scope(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Scope{" +
                "value='" + value + '\'' +
                '}';
    }
}
