package test;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入身高（m）：");
		double height = s.nextDouble();
		System.out.println("请输入体重（kg）：");
		double weight = s.nextDouble();
		double exponent = weight / (height*height);
		System.out.println("您的BMI指数为：" + exponent);
		System.out.println("您的体重属于：");
		if (exponent < 18.5) {
			System.out.println("体重过轻");
		}
		else if (exponent >=18.5 && exponent < 24.9) {
			System.out.println("正常范围");
		}
		else if (exponent >=24.9 && exponent < 29.9) {
			System.out.println("体重过重");
		}
		else if (exponent >=29.9) {
			System.out.println("肥胖");
		}
		s.close();
	}

}
