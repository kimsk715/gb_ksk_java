package operTest;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) {
		int num1=0, num2=0 ;
		String result="";
		Scanner num = new Scanner(System.in);
		
		num1 = num.nextInt();
		num2 = num.nextInt();
		
		boolean check1 = false, check2 = false;
		check1 = num1 > num2;
		check2 = num1 == num2;
		result = check1 ? "더 큰 값:" + num1 : check2 ? "두 수가 같습니다" : "더 큰 값 : " + num2;
		System.out.println(result);
	}
}

// 두 수를 비교해서 더 큰 값 확인?
// 두 수가 같을 경우 
