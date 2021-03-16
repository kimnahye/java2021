package book.ch4;

public class SwitchTest {

	public static void main(String[] args) {
		int protocol = 100;//로그인
		protocol = 200;//입장하기
		protocol = 300;//다지간 대화 
		protocol = 301;//귓소말 1:1 대화 
		String id = "tomato";
		String input = "오늘 스터디 할까 ";
		String msg = protocol+"#"+id+"#"+input;
		switch(protocol) {//원시형 타입 + String탑입
		//제언문의 역할은업무 순서에 대한 흐름을 바꾼다.
		// 순서에 대한 정보를 바탕으로 의사를 결정 할 수 있는 것은팀장 ,차장 ,부장선택자 
		// 선택(비지니스로직계층- Model계층)따라
		//break -continue
		//break
		//for문 ,while ..... 무한루프를 방지하기 위해서 
		//if문 break 대신에 return이다. 메소트를탈출한다.
		//switch break는 switch문을 탈출한다 . 
		case 0:
		System.out.println("0입니다.");
		break;
		case 301:
		System.out.println("301입니다.");
		break;
		case 100:
		System.out.println("100입니다.");
		break;
		default:
		System.out.println("default입니다.");
		break;
		}///end of switch
          System.out.println("여기");
	}

}
//Switch문의 형식
//switch(변수){
//case 값1 : 
//    실행문; 
//    break;
//case 값2 : 
//    실행문; 
//    break;  
//default;    
//}
