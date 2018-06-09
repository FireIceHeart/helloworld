package javaclass;

public class Person {
	private String name; //private 只可修饰成员变量，不可修饰局部变量，只在本类中可被调用
	private int age;
	private char sex;
	public void speak() {
		System.out.println(name+age+sex);
	}
	public void setage(int a) { //通过方法修改age
		if(age<0|age>100) {
			age = 0;
		}else {
			age = a;
		}
	}
	public int getage() {
		return age; //返回age，使外部类可获取
	}
	public Person(String name,int age,char sex) {
		this.name = name;
		this.age =age;
		this.sex = sex;
	}
}
