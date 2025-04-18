package methodTest;

import java.util.Scanner;

public class MethodTask {
	
	void printNum() {
//	1~10까지 println()으로 출력하는 메소드
		for(int i=0; i<10; i++) {
			System.out.print(i+1 + " ");
		}
	}
//	홍길동 n번 출력
	void printHong(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("홍길동 ");
		}
		System.out.println("\n");
	}
//	이름 n번 출력	
	void printName(int n, String name) {
		for(int i=0; i<n; i++) {
			System.out.print(name+" ");
		}
	}
//	세 정수의 뺄셈 메소드
	int subStract3(int m, int n, int o) {	
		return (m-n-o);
	}
	
	int squareN(int n, int m){
		int result = 1;
		for(int i=0; i<n; i++) {
			result *= m;
//			m의 n승
		}
			return result;
	}		
	
	
	
//	두 정수의 나눗셈 후 몫과 나머지 두개 반드시 리턴
	int[] divideTwo(int num1, int num2) {
		int[] divide = null;
		if(num2 !=0) {
		divide = new int[] {num1/num2, num1%num2};	
		}
		return divide;
	}


//	1~n까지의 합
	
	int sum(int n) {
		int total = 0;
		for(int i=0; i<n; i++) {
			total += i+1;
		}
		return total;
	}
	
	int change(int n) {
		return ++n;
	}
	
//	5개의 정수를 입력받고 최댓값, 최솟값
	
	int[] getMaxMin(int[] numbers) {
		int max = numbers[0];
		int min = numbers[0];
		for(int i=0; i<numbers.length-1; i++) {
			max = max > numbers[i+1] ? max : numbers[i+1];
			min = min < numbers[i+1] ? min : numbers[i+1];
		}
		int[] arResult = {max,min};		
		return arResult;
		
	}
//  ★ 고수만 하기
//  위에서 해결한 문제를 아래의 방법으로 해결한다.
//  리턴 타입은 void로 설정하고, 사용하는 부분에서 메소드 내부의 결과값을 사용할 수 있도록 구현
//  원본이 바뀌지 않게 새로운 매개변수를 받는다.
//	

	void getMaxMin2(int[] arNum, int result[]) { //메소드에서 입력받을 내용물 = int 배열. 수정 가능한 상태가 됨. --> 원본이 어디서 수정되었는지 확인하기 힘듦.
		result[0] = arNum[0];
		result[1] = arNum[0]; // 최대, 최소를 변수로 정의하고, 초기값을 아예 배열의 첫번째 값으로 설정.
		for(int i=0; i<arNum.length-1; i++) { // 첫번째 값은 비교할 필요가 없으므로, 4번만 반복하고 2~5번째 값들만 비교 
			result[0] = result[0] > arNum[i+1] ? result[0] : arNum[i+1];
			result[1] = result[1] < arNum[i+1] ? result[1] : arNum[i+1];
		}
//		최대/최소값 알고리즘
		//출력 부분 = 메소드 자체의 결과값으로 얘가 리턴값이 아님.
//		하지만 메소드를 main 메소드에서 실행하면 printf가 실행되서 결과가 출력됨.
		System.out.println("\n메소드 내부 주소값 : " + result);
	}
//	두 정수의 덧셈과 뺄셈 구해주는 메소드
	
//	int[] plusMinus(int num3, int num4) {
//		int[] calc = null;
//		if(num3 > num4) {
//			calc = new int[] {num3+num4, num3-num4};
//		}
//		else {
//			calc = new int[] {num3+num4, num4-num3};
//		}
//		
//		return calc;
//	}
	
	void plusMinus2(int[] nums, int result[]) {
		result[0]=nums[0]+nums[1];
		result[1]=nums[0]-nums[1];
		System.out.println("두 수의 합은 " + result[0] + " 두 수의 차는 " + result[1] );
		System.out.println("\n메소드 내부 주소값 : " + result);
	}
	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		int[] arData = {99,1,5,6,7};
		int[] arResult = new int[2];
		m.getMaxMin2(arData, arResult);
		System.out.printf("최댓값은 %d, 최솟값은 %d", arResult[0], arResult[1]);
		System.out.println("\n메소드 외부 주소값 : " + arResult);
		
		int[] arData2= {10,4};
		int[] arResult2 = new int[2];
		m.plusMinus2(arData2, arResult2);
		System.out.println("\n메소드 외부 주소값 : " + arResult2);
//		 arResult랑 result 는 같은 주소값을 가짐 
//		즉, 주소값을 받아와서 출력했기 때문에, 열에 한 번 접근해서 값을 확인할 수 있음.
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int result = 0 ;
//		result = m.squareN(2,3);
//		System.out.println(result);
//	정수 1개를 입력 받고, 차수도 입력받는다.
//	해당 차수만큼의 값을 구해주는 메소드 선언
//		
//		System.out.print("숫자를 입력 ");
//		System.out.println("이름을 입력");
////		m.printNum();
//		Scanner num = new Scanner(System.in);
//		Scanner name = new Scanner(System.in);
//		int number = 0;
//		number = num.nextInt();
//		String name1 = "";
//		name1 = name.next();
//		m.printHong(number);
//		m.printName(number, name1);
//		위에는 입력까지 테스트한 내용.
		
//		System.out.println(m.subStract3(10, 4, 3));
//		int[] arResult = null;
//		arResult = m.divideTwo(10, 3);
//	      
//	      if(arResult == null) {
//	         System.out.println("0으로 나눌 수 없습니다.");
//	      }else {
//	         System.out.println("몫: " + arResult[0] + ", 나머지: " + arResult[1]);
//	      }
//		arResult = m.plusMinus(5, 19);
//		System.out.println("두 수의 합은 " + arResult[0] +", 두 수의 차는 " + arResult[1]);
////	    
//		Scanner numbers = new Scanner(System.in);
//		int[] check = new int[5];
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("정수를 입력 받으세요.");
//			check[i] = numbers.nextInt();
//		}
//		
//		int[] arResult = m.getMaxMin(check);
//		System.out.println("최댓값은 " + arResult[0] + ", 최솟값은 " + arResult[1]);
////		
		
////		System.out.println("합은 " + m.sum(5));
//		System.out.println(m.change(10));
		
		
		
	}
}
