package com.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Question {
	
	
	
	private Long QuestionId;
	
	private String question ;
	private Long quizId;

	public Long getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(Long questionId) {
		QuestionId = questionId;
	}

	public String getQuestion() {
		
		return question;
	}
	

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
	

}
