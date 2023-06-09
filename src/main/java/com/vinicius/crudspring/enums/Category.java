package com.vinicius.crudspring.enums;

public enum Category {

    FRONT_END("Front-end"), BACK_END("Back-end");

    private String value;

    private Category(String category) {
        this.value = category;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
