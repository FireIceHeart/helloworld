package Object;

public class SupportHero extends Hero implements Healer {
	public void heal(){
		System.out.println("����");
	}
	int hp;
	public void heal(Hero h1){
		System.out.println("��" + h1.name + "��Ѫ");
	}
	public void heal(Hero h1 , Hero h2) {
		System.out.println("��" + h1.name + h2.name + "��" + hp + "Ѫ" );
	}
	public static void main(String[] args) {
		SupportHero s = new SupportHero();
		s.name = "����";
		s.hp = 100;
		Hero h1 = new Hero();
		h1.name = "����";
		Hero h2 = new Hero();
		h2.name = "��Ī";
		s.heal(h1);
		s.heal(h1 , h2);
	}

}
