package com.simonjohansson;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by simon on 28/04/16.
 */
@Entity
public class Gig {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @OneToOne
    private Venue venue;

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    private java.sql.Date date;
    private java.sql.Time time;

    private String description;

    public Gig(Date date, Time time, String description, Venue venue) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public Venue getVenue() {
        return venue;
    }

    public String getDescription() {
        return description;
    }

    Gig(){

    }
}
