package com.bestnastos.constants;

public enum ElementsPacksMenuOptions {

    HTML_5("HTML 5"),
    BOOTSTRAP("Bootstrap");

    private String value;

    ElementsPacksMenuOptions(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
