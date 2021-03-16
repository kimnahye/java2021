package book.ch4;

public class ForTest {

	public static void main(String[] args) {
		int i = 11;
		int hap = 0;
		for(i=1;i<=10;i=i+1) {
			if(i%2==0) {
				hap = hap + i ;
			}
			System.out.println("1부터10까지 세면서 짝수의 합을 구한 결과는 "+hap);
		}
		System.out.println(hap);
		System.out.println("==========================");

	}

}
