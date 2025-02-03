package com.example.demo.sbd.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class QuestionController {
	
	private final QuestionRepository questionRepositroy;
	
	@GetMapping("/question/list")
	public String list(Model model) {
		List<Question> questionList = this.questionRepositroy.findAll();
		model.addAttribute("questionList",questionList);
		return "question_list";
	}
}
