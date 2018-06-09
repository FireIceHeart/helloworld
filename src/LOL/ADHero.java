package LOL;

public class ADHero extends Hero {
	public ADHero(String name){
	       super(name);
	       System.out.println("AD Hero的构造方法");
	}
	public static void main(String[] args) {
		new ADHero("德莱文");

	}

}
