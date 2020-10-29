package com.bestnastos.constants;

public enum ServiceMenuOptions {

    SUPPORT("Support"),
    DATES("Dates"),
    SEARCH("Search"),
    COMPLEX_TABLE("Complex Table"),
    SIMPLE_TABLE("Simple Table"),
    USER_TABLE("User Table"),
    TABLE_WITH_PAGES("Table with pages"),
    DIFFERENT_ELEMENTS("Different elements"),
    PERFORMANCE("Performance");

    private String value;

    ServiceMenuOptions(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
