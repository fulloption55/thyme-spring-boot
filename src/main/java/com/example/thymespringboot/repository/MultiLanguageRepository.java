package com.example.thymespringboot.repository;

import com.example.thymespringboot.repository.entity.MultiLanguageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiLanguageRepository extends CrudRepository<MultiLanguageEntity, Long> {
    MultiLanguageEntity findByMsgCodeAndLangCode(String msgCatCd, String langCd);
}
