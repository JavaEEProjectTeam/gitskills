package lesson3;

public class SingleQuestion extends Question{
	private String answer;
	public SingleQuestion(int id, String title, String[] options,String answer) {
		super(id, title, options);
		this.answer = answer;
	}
	@Override
	public boolean check(String[] answers) {
		if(answers.length!=1)
			return false;
		return this.answer.equals(answers[0]);
	}
}
