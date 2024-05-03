package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;

import jakarta.ws.rs.GET;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService service;
	
	@PostMapping("/add")
    public String add(@RequestBody Quiz quiz) {
		service.add(quiz);
		
    	return "Successfully added in db" ;
    }
	
	@GetMapping("/getall")
	public List<Quiz> get() {
		return service.get();
		
	}
	
	@GetMapping("/{id}")
	public Quiz getById(@PathVariable Long id) {
		return service.get(id);
	}
	
//	@GetMapping("/quiz/{userId}")
//	public List<Quiz> getAll(@PathVariable int userId ){
//		return service.getQuizBYUserId(userId);
//	}
    
    
	
	
}
