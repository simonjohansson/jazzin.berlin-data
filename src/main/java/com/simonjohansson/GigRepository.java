package com.simonjohansson;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

/**
 * Created by simon on 28/04/16.
 */
public interface GigRepository extends PagingAndSortingRepository<Gig, Long> {
    Gig findByDate(@Param("date") Date date);
}
