package com.tut.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_Id")
	private int answerId;

	private String answer;

	@ManyToOne
	private Question question;
	
	/* what is mappedBy 
	 * - Without `mappedBy:
  Hibernate creates separate foreign key columns in both tables (`question` and `answer`), which leads to duplicate relationships and inconsistency.

- With `mappedBy`:
  Hibernate uses the `answer` field in the `Question` entity to handle the foreign key reference. The foreign key column (`que_id`) appears only in the `Question` table, avoiding duplication.

	 * 
	 * 
	 */

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
