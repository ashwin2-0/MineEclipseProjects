package com.tut.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.map.Answer;
import com.tut.map.Question;

public class CascadingDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();

	// creating question
	Question q1 = new Question();
	q1.setQuestionId(8547);
	q1.setQuestion("What is OOPS ?");

	// creating Answer
	Answer ans1 = new Answer();
	ans1.setAnswerId(895);
	ans1.setAnswer("OOPS is Programming Language");
	ans1.setQuestion(q1);

	Answer ans2 = new Answer();
	ans2.setAnswerId(896);
	ans2.setAnswer("OOPS is OOPS Concept Language");
	ans2.setQuestion(q1);

	Answer ann3 = new Answer();
	ann3.setAnswerId(897);
	ann3.setAnswer("With the help of OPPS we can make software");
	ann3.setQuestion(q1);

	List<Answer> ansList = new ArrayList<>();
	ansList.add(ann3);
	ansList.add(ans2);
	ansList.add(ans1);
	q1.setAnswers(ansList);

	// get session
	Session s = factory.openSession();

	/*
	 * s.save(ann3); s.save(ans2); s.save(ans1);
	 */
	 s.save(q1);
	Transaction tx = s.beginTransaction();
	/*
	 * Question loadQ = s.get(Question.class, 1587);
	 * System.out.println("value for question is :" +
	 * "id :"+loadQ.getQuestionId()+" Que :"+loadQ.getQuestion());
	 * System.out.println("Number of answer available for question id :"+loadQ.
	 * getQuestionId()+" is :"+loadQ.getAnswers().size());
	 */
	/*
	 * for (Answer ans : loadQ.getAnswers()) { System.out.println("id :" +
	 * ans.getAnswerId() + " Answer :" + ans.getAnswer()); }
	 */
	tx.commit();
	s.close();
	factory.close();

}
}
