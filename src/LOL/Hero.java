package LOL;

public class Hero {// Hero ����
	//���ԣ�
	String name;//���� �ַ���
	float hp;//Ѫ�� ������
	float armor;//����
	int moveSpeed;//�ƶ��ٶ� ����
	int kill;
	int death;
	int assitant;
	//�������Ӷ���
	void keng(){ //void �޷���ֵ
		System.out.println("�Ӷ���");
	}
	//��������ȡ����ֵ
	float getArmor(){
		return armor;//�з���ֵ�����ظ�����
	}
	//�����ƶ��ٶȣ�С������Ϊ����
	void addSpeed(int speed){
		//��ԭ��������������
		moveSpeed = moveSpeed + speed;
	}
	//����
	void legendary(){
		System.out.println("����");
	}
	//��ȡ��ǰѪ��
	float getHP(){
		return hp;
	}
	//��Ѫ
	void recovery(float blood){
		hp = hp + blood;
	}
	//super
	 public Hero(){
	        System.out.println("Hero���޲εĹ��췽�� ");
	    }
	     
	 public Hero(String name){
	       System.out.println("Hero����һ�������Ĺ��췽�� ");
	       this.name = name;
	   }
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.recovery(50);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		new Hero();
	}
}
