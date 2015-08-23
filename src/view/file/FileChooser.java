package view.file;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.swing.JDialog;
import javax.swing.JFileChooser;

import controller.IOController;


public class FileChooser {
	
	public boolean invokeFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(new JDialog());
		
		if (result == JFileChooser.APPROVE_OPTION) {
			File dialogueFile = fileChooser.getSelectedFile();
			IOController ioController = new IOController();
			ioController.setPath(dialogueFile.getPath());
			return true;
		} else {
			return false;
		}
	}
}
