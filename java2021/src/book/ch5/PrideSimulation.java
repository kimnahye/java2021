package book.ch5;


public class PrideSimulation {

	public static void main(String[] args) {
		//private으로 했을 경우 인캡슐레이션이 적용되는것이다.
		//생성자를 선언할 떄 Private으로 선언 했으므로 디폴트 생성자를 활용하고 
		//싶다면 싱글팬턴으러 정의하여 사용해야한다.
		//Pride myCar = new Pride();
		Pride herCar = new Pride(10);
		Pride himCar = new Pride(100,4);
		himCar.wheeLNum = 4;//4-> 14
		herCar.wheeLNum = 14;
		Pride.wheeLNum =5;
		himCar.speed =10;//10->50 
		herCar.speed =50;
		System.out.println("himCar.wheelNum :"+himCar.wheeLNum);
		System.out.println("herCar.wheelNum :"+herCar.wheeLNum);
		System.out.println("herCar.wheelNum :"+Pride.wheeLNum);
		System.out.println("himCar.wheelNum :"+himCar.wheeLNum);
		System.out.println("herCar.wheelNum :"+herCar.wheeLNum);

	}

}
