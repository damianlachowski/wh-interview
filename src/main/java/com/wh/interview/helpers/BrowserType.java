package com.wh.interview.helpers;

public enum BrowserType {
    MOBILE("MOBILE"),
    DESKTOP("DESKTOP");

    private final String browser;

    private BrowserType(final String browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return browser;
    }
}
