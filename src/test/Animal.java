package test;

public abstract class Animal {
	protected int legs;
	protected Animal(int legs){
		this.legs =legs;
	}
	public abstract void eat();
	public void walk(int legs){
		System.out.println("������"+legs+"������·");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
