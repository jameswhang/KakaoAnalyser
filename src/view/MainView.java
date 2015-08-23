package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import view.file.FileAction;
import view.components.CurrentPathDisplay;

public class MainView
{
	// 프레임 선언
	JFrame jFrame = new JFrame("KakaoTalk Analyzer");
	JTextArea resultView = new JTextArea();
	JPanel topPanel = new JPanel(); // the panel that goes on the top
	

	// 메뉴 선언
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu helpMenu = new JMenu("Help");

	// Components
	CurrentPathDisplay cpd = new CurrentPathDisplay();
	
	// Actions
	FileAction fileAction = new FileAction();

	public MainView()
	{
		
		// 파일 메뉴 생성
		fileMenu.add(fileAction);
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.addSeparator(); //구분선 추가
		fileMenu.add(new JMenuItem("Quit"));

		// 도움 메뉴 생성
		helpMenu.add(new JMenuItem("Version"));
		helpMenu.add(new JMenuItem("FAQ"));

		// 메뉴를 메뉴바에 등록
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		// Panel
		topPanel.add(new JButton("Analyze!"));
		topPanel.add(cpd);
		
		// 메뉴바 추가
		jFrame.setJMenuBar(menuBar);
		jFrame.add(topPanel, "North");
		jFrame.add(resultView, "Center");
		
		// 프레임 크기 지정
		jFrame.setSize(600, 600);

		// 프레임 보이기
		jFrame.setVisible(true);

		// swing에만 있는 X버튼 클릭시 종료
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		// 실행
		new MainView();
	}
}