package Object;

public class SupportHero extends Hero implements Healer {
	public void heal(){
		System.out.println("治疗");
	}
	int hp;
	public void heal(Hero h1){
		System.out.println("给" + h1.name + "加血");
	}
	public void heal(Hero h1 , Hero h2) {
		System.out.println("给" + h1.name + h2.name + "加" + hp + "血" );
	}
	public static void main(String[] args) {
		SupportHero s = new SupportHero();
		s.name = "辅助";
		s.hp = 100;
		Hero h1 = new Hero();
		h1.name = "盖伦";
		Hero h2 = new Hero();
		h2.name = "提莫";
		s.heal(h1);
		s.heal(h1 , h2);
	}

}
