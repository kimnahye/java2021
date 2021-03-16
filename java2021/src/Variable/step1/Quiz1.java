package Variable.step1;

public class Quiz1 {
	//메소드에는 2ㅏ지 종류가 있다.
	//JVM에서 제공되는 메소드와 사용자 정의 메소드 
	//메소드 선언 순서는 리턴타입 메소드이름(){실행문 ;} - 기초이다 
	//메소드 선언할떄 리턴타입과 변환타입을 결정할 수 있다. - 기초가 아니다

	public static void main(String[] args) {
		Quiz1 q = new Quiz1();
		q.methodA();//문법에러 해결하기 
		q.methodA(5);
	}
	private void methodA() {
		System.out.println("methodA 호출 성공");
	}
	private void methodA(int x) {
		System.out.println("methodA(int x) 호출 성공"+x);
	}
}
