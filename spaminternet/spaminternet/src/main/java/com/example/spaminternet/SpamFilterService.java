package com.example.spaminternet;

import java.util.Arrays;
import java.util.List;

public class SpamFilterService {
    private List<String> spamUrls = Arrays.asList("spam.com", "malware.com", "phishing.com");
    private List<String> spamKeywords = Arrays.asList("free", "win", "click here");

    public boolean isSpamUrl(String url) {
        return spamUrls.stream().anyMatch(url::contains);
    }

    public boolean containsSpamKeyword(String content) {
        return spamKeywords.stream().anyMatch(content.toLowerCase()::contains);
    }
}
