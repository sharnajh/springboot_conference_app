package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.List;

@Entity(name = "speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;

    @Column(name = "first_name")
    private String speaker_firstname;

    @Column(name = "last_name")
    private String speaker_lastname;

    @Column(name = "title")
    private String speaker_title;

    @Column(name = "company")
    private String speaker_company;
    private String speaker_bio;

    @Lob
    @JdbcTypeCode(Types.VARBINARY)
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    private List<Session> sessions;
    public Speaker() {
    }

    public byte[] getSpeaker_photo() {
        return speaker_photo;
    }

    public void setSpeaker_photo(byte[] speaker_photo) {
        this.speaker_photo = speaker_photo;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getSpeaker_firstname() {
        return speaker_firstname;
    }

    public void setSpeaker_firstname(String speaker_firstname) {
        this.speaker_firstname = speaker_firstname;
    }

    public String getSpeaker_lastname() {
        return speaker_lastname;
    }

    public void setSpeaker_lastname(String speaker_lastname) {
        this.speaker_lastname = speaker_lastname;
    }

    public String getSpeaker_title() {
        return speaker_title;
    }

    public void setSpeaker_title(String speaker_title) {
        this.speaker_title = speaker_title;
    }

    public String getSpeaker_company() {
        return speaker_company;
    }

    public void setSpeaker_company(String speaker_company) {
        this.speaker_company = speaker_company;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }
}
