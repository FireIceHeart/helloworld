package test;

public class Fish extends Animal implements Pet{
	protected Fish(){
		super(0);
	}
	private void Fish(){
		System.out.println("������ר�е��޲ι��취");
	}
	private String name = "��";
	public void eat(){
		System.out.println("���Ϻ");
	}
	public void play(){
		System.out.println("�㲻����");
	}
	public void walk(){
		System.out.println("��û�������Բ�����");
	}
	public String setName(){
		 name =this.name;
		 return name;
	}
	public String getName(){
		return name;
	}
}
