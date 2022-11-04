package com.project.reviewSite_backend.Review;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

//    @Column(columnDefinition = "integer default 0", nullable = false)
//    private int view;

//    private Integer star_score;


}
