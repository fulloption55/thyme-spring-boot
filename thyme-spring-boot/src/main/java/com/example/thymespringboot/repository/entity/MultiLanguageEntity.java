package com.example.thymespringboot.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "multi_language")
public class MultiLanguageEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "lang_code")
    private String langCode;

    @Column(name = "msg_code")
    private String msgCode;

    @Column(name = "message")
    private String message;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private Date createDate;

    @Column(name = "last_mod_date")
    private Date lastModifyDate;
}


