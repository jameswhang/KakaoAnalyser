package object;

public class Line {
	private String str;
	private String personName;
	private String time;
	private String text;
	
	public Line(String s) {
		this.str = s;
		
		String[] lineInfo = s.split(",");
		this.time = lineInfo[0];
		this.personName = lineInfo[1].trim().replaceAll("\"","");
		this.text = lineInfo[2].trim().replaceAll("\"", "");
		
	}
	
	public String getString() {
		return this.str;
	}
	
	public String getPerson() {
		return this.personName;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String getText() {
		return this.text;
	}
	
	public int getWordCount() {
		return this.text.split(" ").length;
	}
}
