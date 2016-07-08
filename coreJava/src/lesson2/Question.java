package lesson2;

public class Question {
	private int id;
	private String title;
	private String[] options;
	//public Question(){}
	public Question(int id, String title, String[] options) {
		super();
		this.id = id;
		this.title = title;
		this.options = options;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(id).append(".").append(title).append("\n");
		for(String content:options){
			s.append(content).append("\n");
		}
		return s.toString();
		
	}
	public boolean check(String[] answers){
		return false;
	}
}
