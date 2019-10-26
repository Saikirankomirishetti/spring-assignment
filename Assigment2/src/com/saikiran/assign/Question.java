package com.saikiran.assign;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question 
{
	private int questionId;
	private String question;
	private String answers; 

	
	//Getters and setters
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
	
	
	@Override
	public String toString() {
		return "Question [ question=" + question + ", answers=" + answers + "]";
	}



	List<Object> answers1;
	Set<Object> answers2;
	Map<Object,Object> answers3;
	
	public List<Object> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(List<Object> answers1) {
		this.answers1 = answers1;
	}
	
	public Set<Object> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Set<Object> answers2) {
		this.answers2 = answers2;
	}
	public Map<Object, Object> getAnswers3() {
		return answers3;
	}
	public void setAnswers3(Map<Object, Object> answers3) {
		this.answers3 = answers3;
	}
	
	
}	
	