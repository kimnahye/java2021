package book.ch4;

public class ForTest1_1 {

	public static void main(String[] args) {
		int i =1 ;
		int hap1 =0;
		int hap2 =0;
		for(i=1;i<=10;i=i+1) {
			if(i%2==1) {
				hap1= hap1 +i;
			}
			if(i%2==1) {
				hap2= hap2  +i;
			}
		}
		//System.out.println("1부터10까지; 세면서 짝수의 합을 구한 결과는" +hap);
		System.out.println("=========================================");
		System.out.println("1부터 10까지 세면서 홀수의 합을 구한 결과는 "+hap1);
		System.out.println("1부터 10까지 세면서 짝수의 합을 구한 결과는 "+hap2);

	}
	

}
