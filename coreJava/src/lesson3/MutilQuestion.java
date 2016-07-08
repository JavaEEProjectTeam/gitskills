package lesson3;

import java.util.Arrays;

public class MutilQuestion extends Question{
	private String[] answers;
	public MutilQuestion(int id, String title, String[] options,String[] answers) {
		super(id, title, options);
		this.answers = answers;
	}
	@Override
	public boolean check(String[] answers) {
		Arrays.sort(answers);
		return Arrays.equals(this.answers, answers);
	}
}
