package com.project.reviewSite_backend.Review.dao;

import com.project.reviewSite_backend.Review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

//    @Modifying
//    @Query("update Posts p set p.view = p.view + 1 where p.id = :id")
//    int updateView(Long id);

}
