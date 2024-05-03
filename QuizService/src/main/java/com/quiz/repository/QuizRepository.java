package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

	//List<Quiz> findByUserId(Integer id);
}
