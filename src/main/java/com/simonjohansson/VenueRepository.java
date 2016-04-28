package com.simonjohansson;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by simon on 28/04/16.
 */
@Repository
public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

    Venue findByName(@Param("name") String name);
}
