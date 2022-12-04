package com.bean;

public class ConfigEmail {
    private String language;
    private int pageSize;
    private boolean spamFiler;
    private String signature;


    public ConfigEmail() {
    }

    public ConfigEmail(String language, int pageSize, boolean spamFiler, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFiler = spamFiler;
        this.signature = signature;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFiler() {
        return spamFiler;
    }

    public void setSpamFiler(boolean spamFiler) {
        this.spamFiler = spamFiler;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
