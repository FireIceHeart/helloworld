package test;
import java.util.Scanner;
public class LoginService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������6λ�������룺");
		int password = sc.nextInt();
		boolean result = (password == 924867);
		System.out.println("�û������Ƿ���ȷ��" + result);
		sc.close();
		}
}
