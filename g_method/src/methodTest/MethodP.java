package methodTest;

public class MethodP {
	
//	void increase(int data) {
//		data+= 10;
//		System.out.println("메소드1 내부에서의 값 : " + data);
////		계산 자체는 되기 때문에, increase 메소드 안에서의 출력값은 20+10 = 30으로 나옴.
//	}
	
	void increase2(int[] data) {
		data[0] +=10;
		System.out.println("메소드2 내부에서의 값 : " + data[0]);
		System.out.println("메소드2 내부에서의 주소값 : " + data);
	}
	
	
	public static void main(String[] args) {
		MethodP m = new MethodP();
//		int data = 20; // 정수 data의 값 20으로 정의
//		m.increase(data); // increase 메소드 실행. 
//		System.out.println("메소드1 밖에서의 값 : " + data); // void는 리턴값이 없기 때문에, 그대로 20이 출력됨.
		
		int[] data2 = {20};  // data2의 0번째 방에 20이라는 정수 데이터 저장.
//		m.increase2(data2);
		m.increase2(data2);// 메소드 실행.
		
		
		
		System.out.println("메소드2 밖에서의 값 : " + data2[0]);
		System.out.println("메소드2 밖에서의 주소값 : " + data2); // 메소드 내외부에서의 주소값이 같게 출력됨.
	}
}
