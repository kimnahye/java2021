package ch5.singleton;

public class Testing {

	public static void main(String[] args) {
		Singleton1_1 s1 = new Singleton1_1();
		System.out.println("s1:"+s1);
		s1 = null;//Candidate상태로 빠진다.
		s1 = new Singleton1_1();
		System.out.println("s1:"+s1);
		s1 = null;
		s1 = new Singleton1_1();
		System.out.println("s1:"+s1);
		Singleton1_1 uniqueInstance =Singleton1_1.getInstance();
		Singleton1_1 uniqueInstance2 =Singleton1_1.getInstance();
		Singleton1_1 uniqueInstance3 =Singleton1_1.getInstance();
		System.out.println(" uniqueInstance1:"+ uniqueInstance);
		System.out.println(" uniqueInstance2:"+ uniqueInstance);
		System.out.println(" uniqueInstance3:"+ uniqueInstance);
	}

}
