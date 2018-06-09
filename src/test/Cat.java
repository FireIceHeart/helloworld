package test;

public class Cat extends Animal implements Pet {
	protected Cat(int legs){
		super(4);
	}
	private void Cat(){
		this.Cat();
	}
	protected String name = "Ã¨";
	public void eat(){
		System.out.println("Ã¨³ÔÓã");
	}
	public void play(){
		System.out.println("Ã¨°®ÍæÃ«ÏßÇò");
	}
	public String setName(){
		 name =this.name;
		 return name;
	}
	public String getName(){
		return name;
	}
}
