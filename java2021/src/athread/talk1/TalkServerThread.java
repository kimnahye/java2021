package athread.talk1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TalkServerThread extends Thread {
	TalkServer ts = null;
	Socket client = null;
	ObjectOutputStream oss = null;
	ObjectInputStream ois = null;
	// 닉네임
	String nickName = null; // 제훈창 ,희태님 ,제정님
	/*
	 * 
	 */

	public TalkServerThread(TalkServer talkServer) {
		this.ts = talkServer;
		this.client = ts.client;
		try {
			oss = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			String msg = (String) ois.readObject();
			ts.jta_log.append(msg + "\n");

		} catch (Exception e) {

		}
	}

	@Override
	public void run() {

	}
}
