package Object;
/*���ȣ���ȷ����������������͵ĸ���
������������һ������ new ADHero(), ͬʱҲ��һ������ad
�����������͵ģ� ��ADHero
����Ҳ�������͵ģ���ADHero
ͨ������£��������ͺͶ���������һ����
������Ҫ���۵�����ת�������⣬ָ�����������ͺͶ������Ͳ�һ�µ�����µ�ת������*/
public class ����ת�� {
	/*public class Hero {
    public String name;
    protected float hp; 
    public static void main(String[] args) {
        ADHero ad = new ADHero();    
    }
}
Hero h = new Hero();
ADHero ad = new ADHero();
h = ad;			
//�ұ�ad������ָ��Ķ���������� ������Ӣ��
	���h���õ������� ��ͨӢ��
	��������Ӣ�� ���� ��ͨӢ�ۣ�˵��˵��ͨ�� ˵��ͨ���Ϳ���ת
	���е�����ת��Ϊ���࣬����˵��ͨ�ġ������ڻ������ݵ�ת�ͣ��߾���ת�;���һ������

//����ת����
1.        Hero h =new Hero();
2.        ADHero ad = new ADHero();
3.        h = ad;
4.        ad = (ADHero) h;
��3�У�������ת���࣬һ�����Ե�
��4�У����Ǹ���ת���࣬����Ҫ����ǿת��
h������ã���ָ��Ķ�����ADHero, ���Ե�4�У��ͻ��ADHeroת��ΪADHero������ת���ɹ���

1.        Hero h =new Hero();
2.        ADHero ad = new ADHero();
3.        Support s =new Support();
4.        h = s;
5.        ad = (ADHero)h;
��4�У�������ת���࣬�ǿ���ת���ɹ���
��5�У��ǰ�h������ָ��Ķ��� Support��ת��Ϊad���õ�����ADHero��
 �������Ͻ�����������Ӣ�ۣ����ɸ���Ӣ�����ã�˵��ͨ�����Ի�ǿ��ת��ʧ�ܣ������׳��쳣
 //ʵ����ת���ɽӿ�
  ����adָ��Ķ�����ADHero���ͣ��������ʵ����AD�ӿ�
10�У� ��һ��ADHero����ת��ΪAD�ӿ�
����������������һ��ADHero����AD��ʹ�ã���AD�ӿ�ֻ��һ��physicAttack������
�����ζ��ת������п���Ҫ����physicAttack��������ADHeroһ������physicAttack�����ģ�����ת�����ܳɹ��ġ�
public class Hero {
    public String name;
    protected float hp;
       
    public static void main(String[] args) {
        ADHero ad = new ADHero();
          
        AD adi = ad;
          
    }
       
}
68�У� ad����ָ��ADHero�� ��adi�����ǽӿ����ͣ�AD��ʵ����ת��Ϊ�ӿڣ�������ת�ͣ���������ǿ��ת��������һ���ܳɹ�
70��: adiʵ������ָ��һ��ADHero�ģ������ܹ�ת���ɹ�
72�У� adi������ָ��Ķ�����һ��ADHero��Ҫת��ΪADAPHero�ͻ�ʧ�ܡ� 
�����ܹ�ת���ɹ�����ô�Ϳ���ʹ��magicAttack��������adi������ָ��Ķ���ADHero��û��magicAttack�����ġ�
public class Hero {
    public String name;
    protected float hp;
         
    public static void main(String[] args) {
        ADHero ad = new ADHero();
            
        AD adi = ad;
   
        ADHero adHero = (ADHero) adi;
            
        ADAPHero adapHero = (ADAPHero) adi;
        adapHero.magicAttack();
    }
         
}
//instanceof Hero �ж�һ��������ָ��Ķ����Ƿ���Hero���ͣ�����Hero������
 public class Hero {
    public String name;
    protected float hp;
      
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
         
        Hero h1= ad;
        Hero h2= ap;
         
        //�ж�����h1ָ��Ķ����Ƿ���ADHero����
        System.out.println(h1 instanceof ADHero);
         
        //�ж�����h2ָ��Ķ����Ƿ���APHero����
        System.out.println(h2 instanceof APHero);
         
        //�ж�����h1ָ��Ķ����Ƿ���Hero��������
        System.out.println(h1 instanceof Hero);
    }
}
*/
}
