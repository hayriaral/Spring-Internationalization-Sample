package com.example.multilang.service;

import com.example.multilang.helper.LocaleResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class InternationalizationService {

    private final MessageSource messageSource;
    private final LocaleResolver localeResolver;

    @Autowired
    public InternationalizationService(MessageSource messageSource, LocaleResolver localeResolver) {
        this.messageSource = messageSource;
        this.localeResolver = localeResolver;
    }

    public String getIndexMessage(String text, HttpServletRequest request) {
        return messageSource.getMessage(text, null, localeResolver.resolveLocale(request));
    }
}
