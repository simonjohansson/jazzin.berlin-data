package com.simonjohansson;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by simon on 28/04/16.
 */
@Entity
public class Venue {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "venue")
    //private Set<Gig> gigs = new HashSet<>();
    private List<Gig> gigs = new ArrayList<Gig>();

    private String name;

    private String description;

    private String address;
    private String city;
    private int postcode;
    private String addressRemarks;

    public Venue(String name, String description, String address, String city, int postcode, String addressRemarks) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.addressRemarks = addressRemarks;
    }

    public String getName() { return name; }
    public Long getId() {
        return id;
    }

    public List<Gig> getGigs() {
        return gigs;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getAddressRemarks() {
        return addressRemarks;
    }

    Venue(){
    }
}
