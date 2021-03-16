package book.ch4;

import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class switchTestVer2 extends JFrame {

	public static void main(String[] args) {
		switchTestVer2 stv = new switchTestVer2();
		int protocol = 0;// 로그인
		String nickName = "tomato";
		String inputVaule = "오늘 스터디 할까 ";
		String msg = 300+ "#" + nickName + "#" + inputVaule;
		StringTokenizer st = new StringTokenizer(msg, "#");
		protocol = Integer.parseInt(st.nextToken());
		String s_nickName = st.nextToken();
		String s_inputVaule = st.nextToken();
		switch (protocol) {// 원시형 타입 + String탑입
		
		case 0:
			System.out.println("0입니다.");
			break;
		case 301:
			System.out.println("301입니다.");
			break;
		case 100:
			System.out.println("100입니다.");
			break;
		default:
			JOptionPane.showInputDialog(stv,"잘못된 메세지 입니다");
			break;
		}/// end of switch
		System.out.println("여기");
	}
		
	
}
