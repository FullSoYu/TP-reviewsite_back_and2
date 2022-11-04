package com.project.reviewSite_backend;

import com.project.reviewSite_backend.Review.Review;
import com.project.reviewSite_backend.Review.dao.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ReviewSiteBackendApplicationTests {

	@Autowired
	private ReviewRepository reviewRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void CreateReview() {
		Review r = new Review();
		r.setContent("맛있어용");
		r.setCreateDate(LocalDateTime.now());
		reviewRepository.save(r);
	}

}
