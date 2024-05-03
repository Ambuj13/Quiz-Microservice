package com.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository repo;
	
	@Autowired
	private QuestionClient questionClient;
	
//	//creating instance for repository interface-constructor injection
//	public QuizServiceImpl(QuizRepository repo) {
//		this.repo=repo;
//	}
	
	

	@Override
	public String add(Quiz quiz) {
		// TODO Auto-generated method stub
		repo.save(quiz);
		return "Successfully added in db" ;
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		List<Quiz> quizzes=repo.findAll();
		List<Quiz> newQuizList= quizzes.stream().map(quiz->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizList  ;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz=repo.findById(id).orElseThrow(()->new RuntimeException("No quiz with this id found"));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
	}

//	@Override
//	public List<Quiz> getQuizBYUserId(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
	
	

}
