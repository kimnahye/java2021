package book.ch5;
/****************************************************
 * 싱클톤 패턴의 정의 
 * 해당 클래스의 인스턴스가 하나(장적)만 만들어지고 어디서(public)든지 그 인스턴스에 접근할 수 있도록하기 
 * 팬던이다.
 * 클래스변수
 * 방법1 - 고전적인 싱클톤 패턴 구현법
 * 방법2 - 성능이나 병목현상을 고려하여 구현하기
 * 방법3 - 
 * @author heyun
*************************************************** */
public class Pride {
   //클랙스 변수이다.
	static int wheeLNum =0;
	
	int        speed    = 0;
	Pride(){
		}
	public Pride(int speed) {
		this.speed = speed ;
	}
	
	public Pride(int speed, int wheelNum) {
		this.speed = speed ;
		this.wheeLNum = wheelNum;
	
	}
	void speedUp() {
		speed = speed +1 ;
  }
	/*이 경우는 문법 에라가 발생함.
	static void stop() {
		speed = 0;
	}
	*/
	static void Change() {
		wheeLNum =2;
	}
}
