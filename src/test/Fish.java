package test;

public class Fish extends Animal implements Pet{
	protected Fish(){
		super(0);
	}
	private void Fish(){
		System.out.println("这是鱼专有的无参构造法");
	}
	private String name = "鱼";
	public void eat(){
		System.out.println("鱼吃虾");
	}
	public void play(){
		System.out.println("鱼不爱玩");
	}
	public void walk(){
		System.out.println("鱼没有腿所以不能走");
	}
	public String setName(){
		 name =this.name;
		 return name;
	}
	public String getName(){
		return name;
	}
}
