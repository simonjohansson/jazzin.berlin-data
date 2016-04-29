package com.simonjohansson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * Created by simon on 29/04/16.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final GigRepository gigRepository;
    private final VenueRepository venueRepository;

    @Autowired
    public DatabaseLoader(GigRepository gigRepository, VenueRepository venueRepository) {
        this.gigRepository = gigRepository;
        this.venueRepository = venueRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Venue sowieso = venueRepository.save(
                new Venue("Sowieso", "A cool venue", "Asd gata", "Berlin", 10245, ""));

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        for(String date : Arrays.asList("2016-05-01", "2016-05-02", "2016-05-03")){
            for(int hour : Arrays.asList(10, 15, 20)) {
                gigRepository.save(new Gig(
                        new Date(formatter.parse(date).getTime()),
                        new Time(hour, 00, 00),
                        date+" "+hour+":00:00",
                        sowieso));

            }
        }
    }
}
