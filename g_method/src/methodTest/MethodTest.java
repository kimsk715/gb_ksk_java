package methodTest;

public class MethodTest {
	
//	f(X) = 2X + 1;
	int f(int x) {
		return 2*x + 1;
	}
//	이름, 나이 2개를 입력받아서 전체 정보 출력하는 메소드
	void printInfo(String name, int age) {
		System.out.println(name + ", " + age);
	}
	
	int square(int num) {
		return num * num;
	}
	
	
	
	
//	main 메소드 : 실행 프로그램을 만들어주는 메소드
//	static 
//	컴파일러가 가장 먼저 메모리에 할당.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재.
//	1. 일반 메소드에 static을 작성하여 동시간대에 메모리로 올려줌.
//	2. 일반 메소드가 소속된 클래스를 Heap 메모리에 할당(new)하여 static이 감지할 수 있도록 함.
	
	public static void main(String[] args) {
		MethodTest m = new MethodTest(); // Heap 메모리에 올라감.
		System.out.println(m.f(3));
		
// 	리턴이 없을 때 void 이므로, 리턴타입 지정하기 전 까지 void로 시작.
//	static 에서 인식하려면, 같은 static 이거나 Heap 메모리에 존재하면 됨.
	}
}
