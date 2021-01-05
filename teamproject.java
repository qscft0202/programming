import java.util.Scanner;

// 정수를 입력받아  * 피라미드 출력하기
public class teamproject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 피라미드 층수를 입력하세요");
		
		int number = scanner.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int k=1; k<number-i; k++) {
				System.out.print(" "); //공백
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꾸기
		}
		
		scanner.close();
	}
}
