package com.example.thymespringboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "movie")
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie {
    @XmlAttribute(name = "bookingdate")
    private String bookingDate;
    @XmlAttribute(name = "director")
    private String director;
    @XmlAttribute(name = "Duration")
    private String duration;
    @XmlAttribute(name = "genre")
    private String genre;
    @XmlAttribute(name = "img")
    private String imageFirst;
    @XmlAttribute(name = "img2")
    private String imageSecond;
    @XmlAttribute(name = "info")
    private String info;
    @XmlAttribute(name = "leadactors")
    private String leadActors;
    @XmlAttribute(name = "maincode")
    private String mainCode;
    @XmlAttribute(name = "mid")
    private String mid;
    @XmlAttribute(name = "rating")
    private String rating;
    @XmlAttribute(name = "release")
    private String release;
    @XmlAttribute(name = "synopsis")
    private String synopsis;
    @XmlAttribute(name = "title")
    private String title;
    @XmlAttribute(name = "trailer")
    private String trailer;
}