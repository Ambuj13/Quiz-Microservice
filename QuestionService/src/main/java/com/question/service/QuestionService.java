package com.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entity.Question;


public interface QuestionService {
	
	
	String add(Question question);
	
	List<Question> getAll();
	
	Question get(Long questionId);
	
	List<Question> getQuestionByQuizId(Long quizId);

}
