package com.quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entity.Question;

//from here we will take data as it is feign client
//@FeignClient(url="http://localhost:8002",value="Question-client")
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {
	
	//create a method
	//implementation will be given by Feign client library
	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionOfQuiz(@PathVariable Long quizId );

}
