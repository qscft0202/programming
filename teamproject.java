import java.util.Scanner;

// ������ �Է¹޾�  * �Ƕ�̵� ����ϱ�
public class teamproject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �Ƕ�̵� ������ �Է��ϼ���");
		
		int number = scanner.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int k=1; k<number-i; k++) {
				System.out.print(" "); //����
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println(); // �ٹٲٱ�
		}
		
		scanner.close();
	}
}
