package arrayTest;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
//      브론즈
//      1 ~ 10까지 배열에 담고 출력
		int[] arBronze1 = new int[10];
		System.out.println("1 ~ 10까지 배열에 담고 출력");
		for(int i=0; i<arBronze1.length; i++) {
			arBronze1[i] = i+1;
			System.out.print(arBronze1[i] + " ");
		}
		System.out.println("\n===========================");
		
//      10 ~ 1까지 중 짝수만 배열에 담고 출력
		int[] arBronze2 = new int[5];
		System.out.println("10 ~ 1까지 중 짝수만 배열에 담고 출력");
		for(int i=0; i<arBronze2.length; i++) {
			arBronze2[i] = 2*(5-i);
			System.out.print(arBronze2[i]+" ");
		}
		System.out.println("\n===========================");
//		일단 보류
		
	
//      1 ~ 100까지 배열에 담은 후 홀수만 출력
		int[] arBronze3 = new int[50];
		System.out.println("1 ~ 100까지 배열에 담은 후 홀수만 출력");
		for(int i=0; i<arBronze3.length; i++) {
			arBronze3[i]=2*i+1;
			System.out.print(arBronze3[i]+" ");
		}
		System.out.println("\n===========================");

//      실버
      
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력 = 2550이 정답.
		System.out.println("1 ~ 100까지 배열에 담은 후 짝수의 합 출력");
		int[] arSilver1 = new int[100];
		int sum=0;
		for(int i=0; i<arSilver1.length; i++) {			
				arSilver1[i] = i+1;	
		}
		for(int i=0; i<50; i++) {
			sum += arSilver1[i]*2;
		}
		System.out.print(sum + " ");
		System.out.println("\n===========================");

//      A ~ F까지 배열에 담고 출력
		System.out.println("A ~ F까지 배열에 담고 출력");
		char[] arSilver2 = new char[6];
//		System.out.println('A'+1);  A=65
		for(int i=0; i<arSilver2.length; i++) {
			arSilver2[i] = (char)(i+65);
			System.out.print(arSilver2[i]+" ");
		}
		System.out.println("\n===========================");

//      A ~ F까지 중 D 제외하고 배열에 담은 후 출력
		System.out.println("A ~ F까지 중 D 제외하고 배열에 담은 후 출력");
		char[] arSilver3 = new char[5];
//		System.out.println('A'+1);  A=65
		for(int i=0; i<arSilver3.length; i++) {
			arSilver3[i] = i>1 ? (char)(i+66) : (char)(i+65);
			System.out.print(arSilver3[i]+" ");
		}
		System.out.println("\n===========================");

//      골드
      
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		int[] numbers = new int[5];
		Scanner num = new Scanner(System.in);
		for(int i=0; i<numbers.length; i++) {
			System.out.println(i+1+"번째 숫자를 입력해주세요.");
			numbers[i]= num.nextInt();
		}
		int max = 0;
		max = numbers[0]; // 배열의 첫 번째 값으로 최대 및 최솟값을 초기화? 설정?
		int min = 0;
		min = numbers[0];
		for(int i=0; i<numbers.length-1; i++) {
			max = numbers[i+1] > max ? numbers[i+1] : max;  
			min = numbers[i+1] < min ? numbers[i+1] : min;  
		}
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(i+1+"번째 숫자 : " + numbers[i]);
//			
//		}
		System.out.printf("최댓값은 %d, 최솟값은 %d",max,min);
		
		System.out.println("\n===========================");
//      다이아
//      사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 입력받는다.
//      입력한 정수들의 평균값을 구한다(소수점 2째자리).
	
	
		System.out.println("입력하고 싶은 숫자의 갯수를 입력해주세요"); // 표시용
		Scanner arSize = new Scanner(System.in); // 평균을 계산할 정수의 개수를 입력받음.
		int arSizenumber = 0;	// 정수의 개수가 배열의 사이즈이므로, 0으로 초기화해놓고, 입력받은 값이 들어갈 예정.
		int[] arDiamond = null;
		
		arSizenumber = arSize.nextInt(); // 입력받은 값을 변수에 저장.
		arDiamond = new int[arSizenumber]; // 배열의 사이즈를 앞서 입력받은 정수로 설정하여, 배열 생성
		
		double sum2 = 0; //평균값을 계산하기 위해 합을 설정. 평균값이 실수로 나올수도 있으므로. double형으로 저장.
		Scanner numbers2 = new Scanner(System.in); // 배열에 넣을 숫자를 입력 받음.

		for(int i=0; i<arDiamond.length; i++) {
			System.out.println(i+1+"번째 숫자를 입력해주세요."); // 각각의 숫자를 입력받음.
			arDiamond[i] = numbers2.nextInt(); // 입력받은 값을 i번째 방에 저장.	
		}
		for(int i=0; i<arDiamond.length; i++) {
			sum2 = sum2 + arDiamond[i]; // 합계를 더해준다.
		}
		double average = sum2 / arSizenumber; // 숫자들의 합을 숫자들의 개수(배열 사이즈)로 나누면 평균값.
		System.out.printf("평균값은 %.2f 입니다.", average); // 결과값 출력.
		
	}
}
