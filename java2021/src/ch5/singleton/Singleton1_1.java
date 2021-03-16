package ch5.singleton;
/*************************************************************
 * 싱글톤 패턴의 정의
 * 해당 클래스의 인스턴스ㅏ 하나만 만들어지고 어디서든지 인스턴스에 
 * 접근할수 있도록  하기 위한 패턴이다.
 * 고전적인 싱글톤 패턴 구현법 .
 *
 **************************************************************/

public class Singleton1_1 {
	private  static Singleton1_1 uniqueInstance = null;
public static Singleton1_1 getInstance() {
	if(uniqueInstance == null) {
		uniqueInstance = new Singleton1_1();
		
	}
	return uniqueInstance;
}
}
