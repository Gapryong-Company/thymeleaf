package com.example.demo.sbd.answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.sbd.question.Question;
import com.example.demo.user.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	
	public void create(String content, Question question, SiteUser author) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateData(LocalDateTime.now());
		answer.setQuestion(question);
		answer.setAuthor(author);
		
		this.answerRepository.save(answer);
	}
}