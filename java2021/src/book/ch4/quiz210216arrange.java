package book.ch4;

import java.util.Scanner;

public class quiz210216arrange {

	public static void main(String[] args) {
		//등비수열 = an^(n-1)
		//Scanner 사용
		Scanner sc = new Scanner(System.in);
		//a 값 입력 유도하기
		System.out.println("a의 값을 입력하세요.");
		int a = 0;
		//a 컴퓨터 인식
		a = sc.nextInt();
		//r 값 입력 유도하기
		System.out.println("r의 값을 입력하세요.");		
		//r 컴퓨터 인식
		int r = 0;
		r = sc.nextInt();
		//n 값 설정하기
		int n = 1;//n-1이 최소한 0이 되도록.
		
		//1~7번 반복해서 수열나타냄 = for문.
		for(n=1;n<8;n+=1) {
			System.out.println(n+"번째 : "+(int)a*Math.pow(r, (n-1)));
		}
		System.out.println("끝");
		//8번 이상에서는 작동안하게 = n-1>7 => break;
		

	}

}