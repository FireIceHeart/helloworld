package Object;

public class �ڲ��� {
/*�ڲ����Ϊ���֣� 
�Ǿ�̬�ڲ��� 
��̬�ڲ��� 
������ 
������

�Ǿ�̬�ڲ��� BattleScore ��ս���ɼ���
�Ǿ�̬�ڲ������ֱ����һ�������涨��

���磺
ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
����ʵ����BattleScore ��ʱ�򣬱��뽨����һ�����ڵ�Ӣ�۵Ļ�����
�﷨: new �ⲿ��().new �ڲ���()
��ΪHero�ķǾ�̬�ڲ��࣬�ǿ���ֱ�ӷ����ⲿ���privateʵ������name��

public class Hero {
    private String name; // ����
 
    float hp; // Ѫ��
 
    float armor; // ����
 
    int moveSpeed; // �ƶ��ٶ�
 
    // �Ǿ�̬�ڲ��ֻ࣬��һ���ⲿ�������ڵ�ʱ�򣬲�������
    // ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
    class BattleScore {
        int kill;
        int die;
        int assit;
 
        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "����");
            else
                System.out.println(name + "��δ����");
        }
    }
 
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "����";
        // ʵ�����ڲ���
        // BattleScore����ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
        // ������ʵ�������뽨����һ���ⲿ�����Ļ���֮��
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
 
}

��һ������������һ����̬�ڲ���
����з�ˮ�������з�ˮ��û��Ѫ��ʱ�򣬼�������Ӣ�۶�ȡ��ʤ��������ֻ��ĳһ�������Ӣ��ȡ��ʤ����
��Ǿ�̬�ڲ��಻ͬ����̬�ڲ���ˮ�����ʵ���� ����Ҫһ���ⲿ���ʵ��Ϊ����������ֱ��ʵ����
�﷨��new �ⲿ��.��̬�ڲ���();
��Ϊû��һ���ⲿ���ʵ���������ھ�̬�ڲ������治���Է����ⲿ���ʵ�����Ժͷ���
���˿��Է����ⲿ���˽�о�̬��Ա�⣬��̬�ڲ������ͨ��ûʲô�������

public class Hero {
    public String name;
    protected float hp;
  
    private static void battleWin(){
        System.out.println("battle win");
    }
     
    //�з���ˮ��
    static class EnemyCrystal{
        int hp=5000;
         
        //���ˮ����Ѫ��Ϊ0��������ʤ��
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();
                 
                //��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
                System.out.println(name + " win this game");
            }
        }
    }
     
    public static void main(String[] args) {
        //ʵ������̬�ڲ���
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
    }
  
}

������ָ����������һ�����ͬʱʵ��������ʹ������Ӽ�ྫ��
ͨ������£�Ҫʹ��һ���ӿڻ��߳����࣬�����봴��һ������

�е�ʱ��Ϊ�˿���ʹ�ã�ֱ��ʵ����һ�������࣬����������ʵ������󷽷���
��Ȼʵ���˳��󷽷�����ô����һ���µ��ֻ࣬������࣬û��������
�������࣬����������

public abstract class Hero {
    String name; //����
          
    float hp; //Ѫ��
          
    float armor; //����
          
    int moveSpeed; //�ƶ��ٶ�
      
    public abstract void attack();
      
    public static void main(String[] args) {
          
        ADHero adh=new ADHero();
        //ͨ����ӡadh�����Կ���adh�����������ADHero��
        adh.attack();
        System.out.println(adh);
          
        Hero h = new Hero(){ //�����಻��ʵ���������ڴ˴���ʵ������ֱ��д�����󷽷����൱���½�һ����
            //����ʵ��attack����
            public void attack() {
                System.out.println("�µĽ����ֶ�");
            }
        };
        h.attack();
        //ͨ����ӡh�����Կ���h�����������Hero$1��ôһ��ϵͳ�Զ����������
          
        System.out.println(h);
    }
      
}

������������Ϊ�����ֵ������� 
���ڲ��಻һ�����ǣ��ڲ�����������ڳ�Ա��λ�ã��������Ժͷ���ƽ�ȵ�λ�á� 
�������������һ����ֱ�������ڴ�������棬��������������forѭ����ȵȵط�

public abstract class Hero {
    String name; //����
          
    float hp; //Ѫ��
          
    float armor; //����
          
    int moveSpeed; //�ƶ��ٶ�
      
    public abstract void attack();
      
    public static void main(String[] args) {
          
        //����������������ڣ������������Զ��������
        class SomeHero extends Hero{
            public void attack() {
                System.out.println( name+ " �µĽ����ֶ�");
            }
        }
         
        SomeHero h  =new SomeHero();
        h.name ="�ز�ʦ";
        h.attack();
    }
      
}

����������ʹ���ⲿ�ľֲ��������ⲿ�ľֲ�������������Ϊfinal

ΪʲôҪ����Ϊfinal������ƱȽϸ��ӣ���ο��ڶ���Hero�����еĽ���

ע����jdk8�У��Ѿ�����Ҫǿ�����γ�final�ˣ����û��дfinal�����ᱨ����Ϊ������͵͵�İ�������˿�������final

public abstract class Hero {
 
    public abstract void attack();
      
    public static void main(String[] args) {
 
        //����������ʹ���ⲿ�ľֲ��������ⲿ�ľֲ�������������Ϊfinal
        final int damage = 5;
         
        Hero h = new Hero(){
            public void attack() {
                System.out.printf("�µĽ����ֶΣ����%d���˺�",damage );
            }
        };
 
    }
      
}

public abstract class Hero {
 
    public abstract void attack();
      
    public static void main(String[] args) {
 
        //����������ʹ���ⲿ�ľֲ�����damage ��������Ϊfinal
        int damage = 5;
         
        //����ʹ�ñ�����AnonymousHero��ģ����������������Ի���
         
        //��ʵ�ϵ������࣬����������������һ��damage���ԣ�����ʹ�ù��췽����ʼ�������Ե�ֵ
        //��attack��ʹ�õ�damage������ʹ�õ�������ڲ�damage�������ⲿdamage
         
        //�����ⲿ���Բ���Ҫ����Ϊfinal
        //��ô��attack���޸�damage��ֵ���ͻᱻ��ʾΪ�޸����ⲿ����damage��ֵ
         
        //�����������ǲ�ͬ�ı������ǲ������޸��ⲿ����damage��
        //����Ϊ�˱�������󵼣��ⲿ��damage��������Ϊfinal,"����ȥ"�Ͳ����޸���
        class AnonymousHero extends Hero{
            int damage;
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            public void attack() {
                damage = 10;
                System.out.printf("�µĽ����ֶΣ����%d���˺�",this.damage );
            }
        }
         
        Hero h = new AnonymousHero(damage);
         
    }
      
}
*/
}
