package com.bestnastos.constants;

public enum MainMenuOptions {

    HOME("Home"),
    CONTACT_FORM("Contact Form"),
    SERVICE("Service"),
    METALS_N_COLORS("Metals & Colors"),
    ELEMENTS_PACKS("Elements Packs");

    private String value;

    MainMenuOptions(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
