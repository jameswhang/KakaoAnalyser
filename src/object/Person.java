package object;

public class Person {
	private String name;
	private int textCount; // number of times this person texted
	private int wordCount; // number of words this person said 
	
	public Person(String name) {
		this.name = name;
		this.textCount = 0;
		this.wordCount = 0;
	}
	
	/* getters */
	public String getName() {
		return this.name;
	}
	
	public int getTextCount() {
		return this.textCount;
	}
	
	public int getWordCount() {
		return this.wordCount;
	}
	
	/* setters */ 
	public void incrementTextCount() {
		this.textCount++;
	}
	
	public void addTextCount(int add) {
		this.textCount += add;
	}
	
	public void setTextCount(int count) {
		this.textCount = count;
	}
	
	public void addWordCount(int add) {
		this.wordCount += add;
	}
	
	public void setWordCount(int count) {
		this.wordCount = count;
	}
}
