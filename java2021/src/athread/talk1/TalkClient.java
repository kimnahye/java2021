package athread.talk1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TalkClient extends JFrame implements ActionListener {
	////////////// 통신과 관련된 전역 변수 추가 /////////////////////
	Socket socket = null;
	// 직렬화 누릴 수 있다.
	ObjectOutputStream oos = null;
	ObjectOutputStream ois = null;
	// 닉네임
	String nickName = null; //
	//////////////화면관련 전역변수 추가 /////////////////
	JTextArea   jta_display = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jta_display);
	JPanel      jp_south       = new JPanel();
	JTextField  jtf_msg    = new JTextField(20);
	JButton     jbtn_send    = new JButton("전송");
    // 소켓 관련 초기화
	public void init() {
		try {
			// 소켓 생성하기 - ip, port - 서버측ServerSocket연결됨.
			socket = new Socket("114.206.44.40", 3000);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois= new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(100+"#"+nickName);
			TalkClientThread tct = new TalkClientThread(this);
			tct.start();//run()호출
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void initDisplay() {
     nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
     jta_display.setEditable(false);
	 jp_south.setLayout(new BorderLayout());
	 jp_south.add("Center",jtf_msg);
	 jp_south.add("East",jbtn_send);
	 this.add("Center", jsp_display);
	 this.add("South", jp_south);
     this.setSize(500,400);	 
     this.setVisible(true);	 
	}

	public static void main(String[] args) {
     TalkClient tc = new TalkClient();
     tc.initDisplay();
     tc.init();//소켓 처리
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
