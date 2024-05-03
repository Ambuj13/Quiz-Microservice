package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository repo;

	@Override
	public String add(Question question) {
		// TODO Auto-generated method stub
		repo.save(question);
		return "Question added in db" ;
	}

	@Override
	public List<Question> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Question get(Long questionId) {
		// TODO Auto-generated method stub
		return repo.findById(questionId).orElseThrow(()->new RuntimeException("Question with this id not found in db"));
	}

	@Override
	public List<Question> getQuestionByQuizId(Long quizId) {
		// TODO Auto-generated method stub
		return repo.findByQuizId(quizId);
	}
	
	

}
