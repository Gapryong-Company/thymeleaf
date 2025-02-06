package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.sbd.answer.Answer;
import com.example.demo.sbd.answer.AnswerRepository;
import com.example.demo.sbd.question.Question;
import com.example.demo.sbd.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@org.springframework.transaction.annotation.Transactional
	@Test
	void testJpa() {
		/*
		
		
		Question q2 = new Question();
		q2.setSubject("집에 너무나도 가고 싶군?");
		q2.setContent("김효원은 꿀꿀 이주원은 끼끼 정찬영은 꿀꿀 ");
		q2.setCreateData(LocalDateTime.now());
		this.questionRepository.save(q2);
		
		List<Question> all = this.questionRepository.findAll();

		  if (!all.isEmpty()) {
	            String firstSubject = all.get(0).getSubject();
	            assertTrue("스프링 부트의 이름은 무슨 뜻인가여?".equals(firstSubject), 
	                       "첫 번째 질문의 제목이 '스프링 부트의 이름은 무슨 뜻인가여?'여야 합니다.");
	        } else {
	            assertTrue(false, "질문 리스트가 비어있습니다.");
	        }
		  
		  //Question q = all.get(0);
		  //assertEquals("스프링 부트의 이름은 무슨 뜻인가요?", q.getSubject());
		  
		
		
		Optional<Question> q = this.questionRepository.findById(3);
		if(q.isPresent()) {
			Question qs = q.get();
			assertEquals("스프링 부트의 이름은 무슨 뜻인가여?", qs.getSubject());
		}
	
		
		Question q = this.questionRepository.findBySubject("집에 너무나도 가고 싶군?");
		assertEquals(4, q.getId());

		Question q = this.questionRepository.findBySubjectAndContent("대충 이거","대충 콘첸트");
		assertEquals(5, q.getContent());
				

		List<Question> qList = this.questionRepository.findBySubjectLike("스프링%");
		qList = this.questionRepository.findAll();
		Question q = qList.get(0);
		assertEquals(1, q.getId());
		
		List<Question> qList = this.questionRepository.findAll();
		assertEquals(21, qList.size());

		Optional<Question> q = this.questionRepository.findById(3);
		assertTrue(q.isPresent());
		Question qs = q.get();
		qs.setSubject("나니와 보쿠노 나마에와");
		this.questionRepository.save(qs);
		this.questionRepository.delete(qs);
		assertEquals(10, this.questionRepository.count());
		

		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		Answer a = new Answer();
		a.setContent("답변입니다.");
		a.setQuestion(q);
		a.setCreateData(LocalDateTime.now());
		this.answerRepository.save(a);

		Optional<Answer> oa = this.answerRepository.findById(1);
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());
								
				*/
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		List<Answer> answerList = q.getAnswerList();
		
		assertEquals(2, answerList.size());
		assertEquals("답변입니다.", answerList.get(0).getContent());
    }
	
	
}
