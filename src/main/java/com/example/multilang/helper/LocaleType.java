package com.example.multilang.helper;

public enum LocaleType {
    ENGLISH("English", "en"),
    TURKISH("Turkish", "tr"),
    CHINESE("Chinese", "zn"),
    GERMAN("German", "de");

    private final String language;
    private final String code; //ISO 639-1 Language Code

    LocaleType(String language, String code) {
        this.language = language;
        this.code = code;
    }

    @SuppressWarnings("unused")
    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }
}
