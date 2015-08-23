package view.file;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class FileAction extends AbstractAction {
	public FileAction() {
		super("Open File");
		putValue(SHORT_DESCRIPTION, "Load KakaoTalk csv for analysis");
	}

	public void actionPerformed(ActionEvent e) {
		FileChooser fChooser = new FileChooser();
		fChooser.invokeFileChooser();
	}
}
