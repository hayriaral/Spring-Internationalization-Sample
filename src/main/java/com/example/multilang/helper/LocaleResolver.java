package com.example.multilang.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
public class LocaleResolver extends AcceptHeaderLocaleResolver {
    private static final List<Locale> LOCALES = Arrays.asList(
            new Locale(LocaleType.ENGLISH.getCode()),
            new Locale(LocaleType.TURKISH.getCode()),
            new Locale(LocaleType.CHINESE.getCode()),
            new Locale(LocaleType.GERMAN.getCode())
    );

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String lang = request.getHeader("Accept-Language");
        if (lang.isEmpty()) {
            return Locale.getDefault();
        }
        List<Locale.LanguageRange> list = Locale.LanguageRange.parse(lang);
        return Locale.lookup(list, LOCALES);
    }
}