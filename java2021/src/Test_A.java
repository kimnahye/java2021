
 
import java.util.Scanner;
 
public class Test_A {
    public static void main(String[] args){
        
        int num1 = 0;
        int num2 = 0;
        int GCD=0;
        int LCM = 0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("첫번째 수 입력 :");
        num1 = sc1.nextInt();
        System.out.print("두번째 수 입력 :");
        num2 = sc2.nextInt();
        int min=num1>num2 ?num2 :num1;
        for(int i=min; i>=1; i--) {
            if(num1%i==0 && num2%i==0) {
                GCD=i;
                break;
            }
        }
        System.out.println("최대 공약수 : " + GCD);
        LCM=num1*num2/GCD;
        System.out.println("최소 공배수 : " + LCM);
    }
}