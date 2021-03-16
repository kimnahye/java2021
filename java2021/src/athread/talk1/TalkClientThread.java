package athread.talk1;

import java.util.StringTokenizer;

public class TalkClientThread extends Thread {
	 TalkClient tc = null;
	 
	 public TalkClientThread(TalkClient talkClient){
		 this.tc = talkClient; //조립이다. 연결
	 }
		 
	@Override
	public void run() {//여기서 말하는 곳이다. 듣는 곳이다.
		System.out.println("run호출 성공");
		boolean isStop = false;
		while(!isStop) {
			try {
				String msg = "";
				msg = (String)tc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;
				if(msg!=null) {//100#제훈#오늘 스터티 할까?
					st = new StringTokenizer(msg,"#");
					protocol = Integer.parseInt(st.nextToken());//100
				}
			switch(protocol) {
			case 100:{
				String nickName = st.nextToken();
				String msg = st.nextToken();//오늘 스터티할까?
				tc.jsp_display.append(nickName+"님이 입장하였습니다.\n"));
			}
			};
			}	catch(Exception e) {
				
			}
		}
	}

}
