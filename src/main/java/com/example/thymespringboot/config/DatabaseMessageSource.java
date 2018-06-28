package com.example.thymespringboot.config;


import com.example.thymespringboot.service.MultiLanguageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.text.MessageFormat;
import java.util.Locale;

@Log4j2
@Component
public class DatabaseMessageSource implements MessageSource {

    @Autowired
    private MultiLanguageService multiLanguageService;

    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return resolveMessage(code, args, locale);
    }

    @Override
    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
        return resolveMessage(code, args, locale);
    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
        for (String code : resolvable.getCodes()) {
            String message = resolveMessage(code, resolvable.getArguments(), locale);
            if (ObjectUtils.isEmpty(message)) {
                log.info("Cannot found [{}] language to resolve use default locale US,en");
                message = resolveMessage(code, resolvable.getArguments(), Locale.US);
                return message;
            } else {
                return code;
            }
        }
        return null;
    }

    private String resolveMessage(String code, Object[] args, Locale locale) {
        String message = multiLanguageService.getMultiLanguage(code, locale.getLanguage());
        MessageFormat messageFormat = new MessageFormat(message, locale);
        return messageFormat.format(args);
    }
}