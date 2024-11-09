package com.example.spaminternet;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spam-check")
public class SpamController {

    private final SpamFilterService spamFilterService = new SpamFilterService();

    @GetMapping("/url")
    public String checkUrl(@RequestParam String url) {
        if (spamFilterService.isSpamUrl(url)) {
            return "Acceso bloqueado: página de spam detectada";
        } else {
            return "URL segura";
        }
    }
}
