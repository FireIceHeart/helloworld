package javaclass;

public class Person {
	private String name; //private ֻ�����γ�Ա�������������ξֲ�������ֻ�ڱ����пɱ�����
	private int age;
	private char sex;
	public void speak() {
		System.out.println(name+age+sex);
	}
	public void setage(int a) { //ͨ�������޸�age
		if(age<0|age>100) {
			age = 0;
		}else {
			age = a;
		}
	}
	public int getage() {
		return age; //����age��ʹ�ⲿ��ɻ�ȡ
	}
	public Person(String name,int age,char sex) {
		this.name = name;
		this.age =age;
		this.sex = sex;
	}
}
