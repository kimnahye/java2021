package quiz0215;

/*
 * 에러에는 두가지가 있다.
 * 하나는 컴파일 타임 에러이고 - 문법에러 이고.....
 * 두번째는 런타임 에러 이다. - 실행 오류이다.(논리의 오류이다)
 */
public class Quiz1_5 {

	public static void main(String[] args) {
		//지구의 몸무게
		double wEarth = 0.0;
		System.out.println("지구의 몸무게를 입력하세요.");
		//시스템(내가 사용하고 있는 컴터)에서 in(입력장치로부터)
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			wEarth = sc.nextDouble();
			
		} catch (Exception e) {
			System.out.println("Exception : "+e.toString());
			return;
		}
		if(sc.hasNextDouble()) {//너 입력한 값 더블이야? 네
			double wMoon = 0.0;
			Quiz1_4 q3 = new Quiz1_4();
			Common cm = new Common();
			wMoon = cm.moonWeight(wEarth);
			System.out.println("지구의 몸무게 : "+wEarth+" kg");
			System.out.println("달의 몸무게 : "+wMoon+" kg");
			
		}
		else {
			System.out.println("실수만 입력하세요... 제발...");
			//return;//main메소드 탈출한다. 22번 아래는 진행할 필요가 없어요.
		}
		System.out.println("요기요기......");
	}

}