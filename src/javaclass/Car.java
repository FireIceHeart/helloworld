package javaclass;

public class Car {
	String color;//��Ա�����������ڴ棬Ĭ�ϳ�ʼ��ֵ
	int wheels;
	public Car(String color,int wheels) {
		this.color = color;
		this.wheels = wheels;
		int a = 3; //�ֲ���������ջ�ڴ棬�����ֶ���ʼ��
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
