package Object;

public class AHero {
//ʹ���вδ�������
	String name; //����
    float hp; //Ѫ��  
    float armor; //����  
    int moveSpeed; //�ƶ��ٶ�
	public  AHero (String heroName, float heroHP, float heroArmor, int heroMoveSpeed ){
		name = heroName;
		hp = heroHP;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
	}
	
	//�������ʹ��� 
	//�ڷ����ڣ��޷��޸ķ�����Ļ������Ͳ���
	 //��Ѫ
    public void huixue(int xp){
        hp = hp + xp;
        //��Ѫ��Ϻ�Ѫƿ=0
        xp=0;
    }
      
    public AHero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    //���ഫ��
    // ����һ��Ӣ�ۣ���������damage��Ѫ
    public void attack(AHero hero, int damage) {
        hero.hp = hero.hp - damage;
    }
    
    /*���һ�������ǻ�������
	���� int hp = 50;
	���Ǿ�ֱ�ӹ�hp�б���
	=��ʾ��ֵ����˼��
	���һ��������������
	���� Hero h = new Hero();
	���Ǿ͹�h�������á�
	=�����Ǹ�ֵ����˼
	=��ʾָ�����˼
	���� Hero h = new Hero();
	��仰����˼��
	����h��ָ��һ��Hero����*/
  //����
    public void revive(AHero h){
        h = new AHero("��Ī",383);
    }
	public static void main(String[] args) {
		AHero garen = new AHero("����", 400 , 50 , 4);
		AHero ace = new AHero("��ϣ", 230 , 20 , 8);
		
		AHero teemo =  new AHero("��Ī",383);
	         
			//Ѫƿ����ֵ��50
			int xueping = 50;
		
			//��Īͨ�����Ѫƿ��Ѫ,Ѫƿ50����ֵ����huixue�Ĳ���xp
			//hp= hp+50=433
		
			//teemo.huixue(xueping);
	        System.out.println(teemo.hp);
	       // garen.attack(teemo, 100);
	        //System.out.println(teemo.hp);
	        teemo.hp = teemo.hp - 400;
	        teemo.revive(teemo);
	        System.out.println(teemo.hp);
	        //Ѫ�������Ǹ�����revive������teemoָ�����һ���µ�temmo,���Բ���ı�ԭ���ı���Ѫteemo
	}

}
