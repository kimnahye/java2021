
package book.ch5;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class SalaryMgr {
   //선언부
   JFrame             jf_sal       = null;
   //DefaultTableModel(DataSet역할:data[][],header[])+JTable=> 테이블
   String             cols[]      = {"사원명","부서명"};
   String             data[][]    = new String[0][2]; 
   JTable             jtb_sal     = null;//화면, 양식, 폼을 그린다.
   DefaultTableModel    dtm_sal    = null;
   JScrollPane         jsp_sal     = null;
   JTableHeader       jth_sal     = null;
   JButton          jbtns[]       = null;
   JButton             jbtn        = null;
   String              jbtns_label[] = {"조회","입력","수정","삭제"};
   JPanel              jp_north    = null;
   //생성자
   public SalaryMgr() {
      jf_sal    = new JFrame();//선언과 생성을 분리해 본다. - 차이 - 메모리 로딩(점유)
      //테이블안에 면에 데이터를 매칭하는데 필요한 클래스 선언(DataSet의 역할을 함-SELECT문 혹은 저장 프로시저와 연계할 클래스임-)
      //웹에서는 JSON의 역할을 수행하는 클래스임.
      dtm_sal   = new DefaultTableModel(data,cols);
      //테이블의 양식을 작성하는 클래스 생성임.
      jtb_sal = new JTable(dtm_sal);
      //JTable에 스크롤 바를 그려줄 속지 클래스 생성
      jsp_sal = new JScrollPane(jtb_sal);
      //메소드를 통해서 객체를 주입받을 수 있다.- 잘하는 사람, 같이 밥먹자
      //테이블의 헤더를 그려줄 클래스 생성
      jth_sal = jtb_sal.getTableHeader();
      //버튼 추가
      jp_north = new JPanel();
      jp_north.setLayout(new GridLayout(1,4,3,3));
      jbtns = new JButton[jbtns_label.length];
      for(int i=0;i<jbtns_label.length;i++) {
         
      }
      initDisplay();
   }
   
   //화면처리부
   public void initDisplay() {
      System.out.println("initDisplay호출 성공");
      jth_sal.setBackground(Color.GREEN);//API활용 능력 키워준다.
      jf_sal.add("Center",jsp_sal);
      jf_sal.setTitle("급여 명세서");
      jf_sal.setSize(400,300);
      jf_sal.setVisible(true);
   }
   
   //main
   public static void main(String[] args) {
      new SalaryMgr();
   }

}