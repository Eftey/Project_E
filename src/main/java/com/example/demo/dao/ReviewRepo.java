package com.example.demo.dao;

import com.example.demo.enteties.Review;
import com.example.demo.enteties.ReviewPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, ReviewPk> {
}
