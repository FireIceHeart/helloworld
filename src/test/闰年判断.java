package test;
import java.util.Scanner;
public class 闰年判断 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = y.nextInt();
		int r1 = year%4;
		int r2 = year%400;
		int nr = year%100;
		if (r1 == 0&&nr !=0 || r2 == 0) {
			System.out.println("闰年");
		}
		else {
			System.out.println("不是闰年");
		}
		y.close();
	}

}
