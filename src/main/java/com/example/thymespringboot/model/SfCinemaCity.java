package com.example.thymespringboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "sfcinemacity")
@XmlAccessorType(XmlAccessType.FIELD)
public class SfCinemaCity {

    @XmlElement(name = "movie")
    private List<Movie> movies;
}