package arrayTest;

public class ArrayTest01 {
	public static void main(String[] args) {
//		int[] arData = {2,4,5,6,8};
		
//		System.out.println(arData); 자바에서 임의로 만든 해시값.
//		System.out.println(arData[1]);
//		System.out.println(arData.length);
	
//		for(int i=0; i<arData.length; i++) {
//			arData[i]=i+1;
//			System.out.println(arData[i]);
//		}
		int[] arData = new int[5];
		for(int i = 0; i < arData.length; i++)
		{
			arData[i] = 5-i;
			System.out.println(arData[i]);
		}
//		System.out.println(arData[1]);
	}
}
