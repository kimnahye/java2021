package Variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언
	void methodA(int x){
	}
		double methodB(int x) {
			return 3.14;
		}
			
		
	
	//메인메소드 - exe파일로 만들 수 있아요
	/*****************************************************************************
	 * 문제해결 키우기
	 * @return void이다. 비어있다 - 돌려받을 수 있는 값이 없다,- 이것떄문에 에러가 발생 수도 있다.
	 * @param args
	 */

	public static void main(String[] args) {
		//System:너의 컴터 out속성 : 출력창치 (하드웨어-모니터,프리터...),print(); 이건 illegal,print(int i),print(double pi),
		System.out.print(5);//줄바꿈안됨 , 메소드를 호출할 수 있니? 너는 주소번지 .methodA();
		//메소드 선언할 떄는 좌중괄호 우중괄호를 사용하고 ...
		// API , XXX.jar, 이 안에 있는 것을 꺼내 쓴다.
		//
		//
		//
		//
		//System.out.print();//줄바꿈 안됨 
		System.out.print(1+" "+1);//줄바꿈 안됨 
		System.out.print(10+10);//줄바꿈 안됨 
		System.out.print(10+"10");//줄바꿈 안됨 
		System.out.print(10+""+10);//줄바꿈 안됨 
		System.out.print("   ");//줄바꿈 안됨 
		System.out.println();
	}

}
