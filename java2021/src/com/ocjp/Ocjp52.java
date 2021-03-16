package com.ocjp;
enum Dogs {collie, harrier, shepherd};
 
public class Ocjp52 {
	void m() {
		String name ="이순신";
		switch (name) {
		case "이순신":
			System.out.print("이순신 ");
		case "김유신":  
			System.out.print("김유신");
		
		}//
	}
	
		public static void main (String[] args) {
			Dogs myDog = Dogs.shepherd;
			switch (myDog) {
			case collie:
				System.out.print("collie ");
			case shepherd:  
				System.out.print("retriever");
			case harrier:
				System.out.print("harrier");
			}
	



	}

}
