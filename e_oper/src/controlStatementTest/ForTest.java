package controlStatementTest;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
//      브론즈
		int i = 0; // 반복문 공통 반복 변수니까 주석 처리 하지 말 것!
		
//      1 ~ 100까지 출력
//		for(i=0; i<100; i++) {
//			System.out.println(i+1);
//		}
		
//		100 ~ 1까지 출력
//		for(i=0; i<100; i++) {
//			System.out.println(100-i);
//		}

//      1 ~ 100까지 중 짝수만 출력
//		for(i=0; i<100; i++) {
//			int num = i+1;
//			if(num % 2 ==0) {
//				System.out.println(num);
//	}}
//		for(i=0; i<50; i++) {
//			System.out.println((i+1)*2);
//		}
		
		
////		1 ~ 10까지 합 출력
//		int sum=0;
//		for(i=0; i<10; i++) {
//			sum += i + 1;
//	}
//		System.out.println(sum);
		
		
//      1 ~ n까지 합 출력(n은 입력받기)		
//	System.out.println("원하는 숫자를 입력하세요!");
//	Scanner num = new Scanner(System.in);
//	int target=0, sum=0;
//	target = num.nextInt();
//	
//	for(i=0; i<target; i++) {
//		sum = sum + i + 1;
//	}
//	System.out.println(sum);
//		
		
		
//	      A ~ F까지 출력
//	     char english = 'A';
//
//	     for(i=0; i<6; i++) {
//	    	 System.out.println(english);
//	    	 english++;
//	     }

//	     A ~ F까지 중 C 제외하고 출력(continue 사용하지 않기)
//	     char english = 'A';
//	     for(i=0; i<6; i++) {
//	    	 if(english != 'C')
//	    	 System.out.println(english);
//	    	 english++;
//	     }
//	      
//		1 2 4 5 6
// 		A에서 1이 증가할 때마다 B C D E F로 진행된다
//		
//		char english = 'A';
//		for(i=0; i<5; i++) {
//			if(i==2) {
////				C는 두 번 반복했을 때의 상태인데, 출력 전에 한번 더 카운트를 늘려주면
//				english++;
////				C 대신 D가 출력됨.
//				System.out.println(english);
//				english++;
////				그 뒤는 똑같이 반복
//			}
//			else {
//				System.out.println(english);
//				english++;
//				
//			}
//		}
		
//		String english = "ABCDE";
//		String result = "";
//		for(i=0; i<5; i++) {
//			if(i>=2) {
//				result += (char)(english.charAt(i)+1);
//			}
//			else {
//				result += (char)(english.charAt(i) );
//
//			}
//		}
//		System.out.println(result);
		
		
//		for(i=0; i<5; i++) {
//			System.out.println((char)(i>=2?i+66:i+65));
//		}

		
//	    0 1 2 0 1 2 0 1 2 0 1 2 출력  
//		int result = 0;
//		for(i=0; i<12; i++) {
//			result = i%3;
//			System.out.println(result);
//		}
//	      
	      
//	    aBcDeF...Z 출력
//		String english = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		final int key = 32;
//		String result = "";
//	
//		for(i=0; i<english.length(); i++) {
//			if(i%2==0) {
//				result += (char)(english.charAt(i) + key);
//			}
//			else {
//				result += (char)(english.charAt(i));
//			}
//		}
//		System.out.println(result);
		
		
//		for(i=0; i<26; i++) {
//			int result = i%2==0 ? (i+97) : (i+65);
//				System.out.print((char)result + " ");
//		}
		
//		for문 한번으로 1~9단
//		int n=1; //앞 숫자
//		int q=1; //뒷 숫자
//		
//		for(i=0; i<81; i++) {
//			if(q>9) {
//				q=1;
//			}
//			
//			n = (i+9)/9;
//			int result = n*q;
//			System.out.printf("%d 곱하기 %d는 %d 입니다.\n",n,  q, result);
//			q++;
//		}
		
		
//		조건식 없이, 변수 i 하나로

//		int i=0;
//		for(i=0; i<81; i++) {
//			System.out.printf("%d 곱하기 %d는 %d 입니다.\n",(i/9+1),(i%9+1),(i/9+1)*(i%9+1));
//		}

		
		
// 최 외곽 괄호 여길 넘지 말 것!	
	}
}

