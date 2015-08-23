package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class IOController {
	private String filePath;
	
	public void setPath(String path) {
		this.filePath = path;
	}
	
	public boolean read() throws UnsupportedEncodingException {
		BufferedReader bufferReader = null;
		String line = "";
		String csvSplitBy = ",";

		PrintStream out = new PrintStream(System.out, true, "UTF-8");
		
		try {
			bufferReader = new BufferedReader (
					new InputStreamReader 
					(new FileInputStream(this.filePath), "UTF8"));
			while ((line = bufferReader.readLine()) != null) {
				String[] lineData = line.split(csvSplitBy);
				
				out.println("Date: " + lineData[0]);
				out.println("Person: " + lineData[1]);
				out.println("Talk: " + lineData[2]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferReader != null) {
				try {
					bufferReader.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		out.println("Done");
		return true;
	}
}
