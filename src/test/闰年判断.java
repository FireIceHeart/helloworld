package test;
import java.util.Scanner;
public class �����ж� {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = y.nextInt();
		int r1 = year%4;
		int r2 = year%400;
		int nr = year%100;
		if (r1 == 0&&nr !=0 || r2 == 0) {
			System.out.println("����");
		}
		else {
			System.out.println("��������");
		}
		y.close();
	}

}
