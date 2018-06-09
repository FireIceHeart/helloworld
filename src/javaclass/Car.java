package javaclass;

public class Car {
	String color;//成员变量，进堆内存，默认初始化值
	int wheels;
	public Car(String color,int wheels) {
		this.color = color;
		this.wheels = wheels;
		int a = 3; //局部变量，进栈内存，必须手动初始化
	}
	public void run(Car c) {
		System.out.println(c.color+c.wheels);
	}
	public static int change(int a) {
		a =10;
		return a;
	}
	public static void main(String[] args) {
		Car w = new Car("red",4);
		Car p = new Car("blue",4);
		//w.run(w);
		int f = 5;
		f = change(f);
		System.out.print(f);
	}

}
