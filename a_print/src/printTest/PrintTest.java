package printTest;

public class PrintTest {
	public static void main(String[] args) {
//		줄바꿈이 없음.
		
//		1. 소스코드에 설명을 작성할 때
//		2. CTRL + /
//		3. 지금 당장 사용하지 않는 코드를 번역하지 않을 때.
		
		
//		제어 문자
//		반드시 따옴표 안에서 작성
//		\n : 줄바꿈(new line), 개행 문자 
//		\t : tab, 위 아래 줄 간격 맞춰 띄기
//		\" : 쌍 따옴표
//		\' : 따옴표
//		\\ : 역슬래시 표현
//		System.out.print("\"한\'동\'석\"\n");
//		System.out.print("\\20살\\");
//		
//		System.out.println("\\n을 사용하면 줄바꿈 할 수 있습니다.");
//		System.out.println("줄바꿈 되었습니다.");
		String name = "한동석";
		int age = 20;
		// 키 150.45 변수에 담기
		double height = 150.45;
//		서식 문자
//		반드시 따옴표 안에 작성.
//		%d : decimal, 10진수 정수
//		%o : 8진수 정수
//		%x : 16진수 정수
//		%f : float, 실수
//		%c : character, 문자
//		%s : String, 문자열
		System.out.printf("이름: %s", name);
		System.out.printf("나이 : %d, 키 : %.2f", age, height);
//		6자리까지만 정확하기 때문에 6자리까지만 출력.
		
		
		}
	}