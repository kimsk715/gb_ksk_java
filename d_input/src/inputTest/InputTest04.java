package inputTest;

import java.util.Scanner;

public class InputTest04 {
	public static void main(String[] args) {
//		두 정수의 뺄셈
		String inputMessage = "값을 두 개 입력해주세요 큰 수를 먼저 입력해주세요 ex) 10 8";
		System.out.println(inputMessage);
		double num1=0.0, num2=0.0, result=0.0;
		Scanner num = new Scanner(System.in);
		num1 = num.nextDouble();
		num2 = num.nextDouble();
		
		result = num1-num2;
//		result = Double.parseDouble(String.format(%.3f,result));
		System.out.printf("%.3f",result);
		
				
	}
}
