package test;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��������ߣ�m����");
		double height = s.nextDouble();
		System.out.println("���������أ�kg����");
		double weight = s.nextDouble();
		double exponent = weight / (height*height);
		System.out.println("����BMIָ��Ϊ��" + exponent);
		System.out.println("�����������ڣ�");
		if (exponent < 18.5) {
			System.out.println("���ع���");
		}
		else if (exponent >=18.5 && exponent < 24.9) {
			System.out.println("������Χ");
		}
		else if (exponent >=24.9 && exponent < 29.9) {
			System.out.println("���ع���");
		}
		else if (exponent >=29.9) {
			System.out.println("����");
		}
		s.close();
	}

}
