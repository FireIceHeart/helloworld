package Object;

public class Armor extends Item {
	int ac;
	public static void main(String[] args) {
		Armor QuiltedArmor = new Armor();
		Armor ChainAcmour = new Armor();
		QuiltedArmor.name = "����";
		QuiltedArmor.ac = 15;
		QuiltedArmor.price = 300;
		ChainAcmour.name = "���Ӽ�";
		ChainAcmour.ac = 40;
		ChainAcmour.price = 500;
	}

}
