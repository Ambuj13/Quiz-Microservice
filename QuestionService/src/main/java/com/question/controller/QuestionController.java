package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	 private QuestionService  service;
	
	@PostMapping("/add")
	public String add(@RequestBody Question question) {
		
		return service.add(question);
	}
	
	@GetMapping
	public  List<Question> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Question get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> findByQuizId(@PathVariable Long quizId){
		return service.getQuestionByQuizId(quizId);
	}
	
	
	
	

}
