package com.quiz.service;

import java.util.List;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;

public interface QuizService {
	
	
	//method to add quiz
	String add(Quiz quiz);
	
	//method to get all  quiz
	List<Quiz> get();
	
	//method to get quiz by id
	Quiz get(Long id);
	
	//method to get quiz by user id
	//List<Quiz> getQuizBYUserId(int id);
	
	

}
