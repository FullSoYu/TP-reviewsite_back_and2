package com.project.reviewSite_backend.Review.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReveiwController {

    @RequestMapping("/MyReviewpage")
    @ResponseBody

    public String mr() {
        return "review_list";
    }
}
