package test;
import java.util.Scanner;
public class �����ж� {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("�������·�:");
        int mon = input.nextInt();
        switch (mon) {
            case 1:
            case 2:
            case 3:
                System.out.println(mon + "���Ǵ���");
                break;
 
            case 4:
            case 5:
            case 6:
                System.out.println(mon + "��������");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(mon + "��������");
                break;
 
            case 10:
            case 11:
            case 12:
                System.out.println(mon + "���Ƕ���");
                break;
            default:
                System.out.println("һ��ֻ��12����");
          }
        input.close();
	}

}
