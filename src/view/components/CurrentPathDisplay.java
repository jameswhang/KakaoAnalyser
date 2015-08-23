package view.components;

import javax.swing.JTextField;

public class CurrentPathDisplay extends JTextField {
	/*
	 * A view component that gets included in the topPanel
	 * Displays the current file chosen 
	 */
	private static final long serialVersionUID = 1L;
	private String path;
	
	public CurrentPathDisplay() {
		super("Current File: None");
	}
	
	public void setPath(String s) {
		this.path = s;
		super.setText(this.path);
	}
}
