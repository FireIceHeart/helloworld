package test;
import java.util.Scanner;
public class 季节判断 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("请输入月份:");
        int mon = input.nextInt();
        switch (mon) {
            case 1:
            case 2:
            case 3:
                System.out.println(mon + "月是春天");
                break;
 
            case 4:
            case 5:
            case 6:
                System.out.println(mon + "月是夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(mon + "月是秋天");
                break;
 
            case 10:
            case 11:
            case 12:
                System.out.println(mon + "月是冬天");
                break;
            default:
                System.out.println("一年只有12个月");
          }
        input.close();
	}

}
