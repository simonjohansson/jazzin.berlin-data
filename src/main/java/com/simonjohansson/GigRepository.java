package com.simonjohansson;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

/**
 * Created by simon on 28/04/16.
 */
public interface GigRepository extends PagingAndSortingRepository<Gig, Long> {
    List<Gig> findByDate(@Param("date") Date date);
    List<Gig> findByDateBetween(@Param("start") Date start, @Param("end") Date end);
}

