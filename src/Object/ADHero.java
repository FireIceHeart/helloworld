package Object;

public class ADHero extends Hero implements AD {
	public void physicAttack() {
        System.out.println("����������");
    }//�ӿ�
	//�������أ�����������ָ���Ƿ�����һ�������ǲ������Ͳ�һ��
	public void attack() {
		System.out.println(name + "������һ�ι���������ȷ������˭");
	}
	public void attack(Hero h1) {
		System.out.println(name + "��" + h1.name + "������һ�ι��� ");
	}
	public void attack(Hero h1, Hero h2) {
        System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
    }
	 // �ɱ������Ĳ�������ʵ�ֶԶ��Ӣ�۹������������ø���attack����
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " ������ " + heros[i].name);
        }
    }
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "�ͽ�����";
		
		Hero h1 = new Hero();
		h1.name = "����";
		Hero h2 = new Hero();
		h2.name = "��Ī";
		
		bh.attack(h1);
		bh.attack(h1, h2);
	}

}
