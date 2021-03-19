package book.ch4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RamdomGameView1_2 extends JFrame {
	//선언부
	//속지(중앙)를 생성하는 클래스 인스턴스화
	JPanel jp_center = new JPanel();
	//버튼 4개를 붙일 속지(동쪽)를 생성하는 클래스 인스턴스화
	JPanel jp_east = new JPanel();
	JButton jbtn_new = new JButton("새게임");
	JButton jbtn_dap = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit = new JButton("나가기");
	JTextArea jta_display = new JTextArea(5,30);
	JTextField jtf_input = new JTextField();
	String s = null;
	//생성자
	public RamdomGameView1_2() {//
		s = new String("");
		System.out.println("디폴트 생성자 호출 성공");
		initDisplay();//인스턴스화없이도 메소드 호출이 가능하다.
	}
	public RamdomGameView1_2(int x) {//메소드 오버로딩 규칙을 준수한다.
		System.out.println("디폴트 생성자 호출 성공");
	}
	//화면처리부 - MVC패턴 
	public void initDisplay() {
		jp_east.setLayout(new GridLayout(4,1));//row 4개 컬럼이 1개로 화면을 n빵
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		jp_center.setLayout(new BorderLayout());
		jp_center.add("Center", jta_display);
		jp_center.add("South", jtf_input);
		this.add("Center",jp_center);
		this.add("East",jp_east);
		this.setTitle("난수 게임. Ver1.0");
		this.setSize(400, 300);
		this.setVisible(true);
		
	}
	//메인메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);//AbstractWindowToolkit - 윈도우 운영체제 화면 을 가져온다. MVC패턴
		RamdomGameView1_2 rgview = new RamdomGameView1_2();//생성자 호출
		//rgview.initDisplay();

	}

}