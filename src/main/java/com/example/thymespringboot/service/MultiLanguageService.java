package com.example.thymespringboot.service;

import com.example.thymespringboot.repository.MultiLanguageRepository;
import com.example.thymespringboot.repository.entity.MultiLanguageEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MultiLanguageService {

    @Autowired
    private MultiLanguageRepository multiLanguageRepository;

    @Cacheable(value = "multi-language", key = "#language.toLowerCase().concat(#msgCode)", unless = "#result == null")
    public String getMultiLanguage(String msgCode, String language) {
        MultiLanguageEntity multiLanguage = multiLanguageRepository.findByMsgCodeAndLangCode(msgCode, language);
        log.info("Resolve message code [{}] with [{}] language from database", msgCode, language);
        return multiLanguage.getMessage();
    }
}
