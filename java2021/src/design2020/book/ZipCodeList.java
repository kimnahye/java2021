package design2020.book;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
/*
 * 지료구조의 종류
 * 1)List계열
 *   ArrayList - 싱글스레드 안전 , 동기화 처리 생략, 속도 빠르다.
 *   Vector - 멀티스레드 안전 , 동기화 처리 , 속도 느린면 
 *   :경합, 다중 접속자처리 , 순서 , 동기화처리 
 *2)Map계열(해시태그)
 *
 *3)Set계열(빈도 낮음)- 집합
 *
 */
public class ZipCodeList extends JFrame{
       
	public static void main(String[] args, Object ZipCodeVO) {
		//꺽쇠: 제네릭이라고 함 . 생성부에는 타입없이 다이아몬드 선언자 붙임
		Vector<ZipCodeVO> v = new Vector<>();
		List<ZipCodeVO> v2 = new Vector<>();
		ZipCodeVO zcVO = null;
		ZipCodeVO zcVOs[] = null;
		int i = 0;
		while(i<3) {
			//zcVO.setAddress("서울시");
			zcVO = new ZipCodeVO();
			zcVO.setAddress("서울시");//ok address = "서울시 "
			System.out.println("zcVO주소번지 바뀐다 =====> " +zcVO);
			v.add(zcVO);
			zcVO.setAddress("인천직할시");// ok address = "서울시"
			i++;
		}
		for(int x=0; x<v.size();x++) {
			ZipCodeVO zVO = v.get(x);//31번에서 만들어진 VO와는 다른 것이다.
			System.out.println(zVO);//다른 주소번지가 출력된다.
		}
		zcVOs= new ZipCodeVO[v.size()];// 객체배열이 3개 만들어 진다.
		System.out.println("배열의 크기" +zcVOs.length);// 3이 출력됨
		v.copyInto(zcVOs);//백터에 담기는 것을 배열에 담아준다
		for(int y=0; y<zcVOs.length;y++) {
			System.out.println(zcVOs[y]+","+zcVOs[y].getAddress());//객체 배열의 주소번지가 3개 출력됟다. 
		}
		
	}
}
