package test;

public class Cat extends Animal implements Pet {
	protected Cat(int legs){
		super(4);
	}
	private void Cat(){
		this.Cat();
	}
	protected String name = "è";
	public void eat(){
		System.out.println("è����");
	}
	public void play(){
		System.out.println("è����ë����");
	}
	public String setName(){
		 name =this.name;
		 return name;
	}
	public String getName(){
		return name;
	}
}
