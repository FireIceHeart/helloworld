package Object;

public class SUPER�ؼ��� {
/*׼����ʽ�ṩ�޲ι��췽���ĸ��� 
	��ʵ����Hero�����ʱ���乹�췽�����ӡ 
	��Hero�Ĺ��췽�� "*/
	/*import property.Item;
 
public class Hero {
        
    String name; //����
        
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
     
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
     
    public Hero(){
        System.out.println("Hero�Ĺ��췽�� ");
    }
     
    public static void main(String[] args) {
        new Hero();
    }
      
}
ʵ����һ��ADHero(), �乹�췽���ᱻ���� 
�丸��Ĺ��췽��Ҳ�ᱻ���� 
�����Ǹ��๹�췽���ȵ��� 
���๹�췽����Ĭ�ϵ��ø���� �޲εĹ��췽��
public class ADHero extends Hero implements AD{
  
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
     
    public ADHero(){
         
        System.out.println("AD Hero�Ĺ��췽��");
    }
     
    public static void main(String[] args) {
 
        new ADHero();
         
    }
  
}
//�����Hero�Ĺ��췽���������ADHero�Ĺ��췽��
 * 
 ���ഴ��ֱ����޲εĹ��췽���ʹ�һ�������Ĺ��췽��
 	import property.Item;
 
public class Hero {
        
    String name; //����
        
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
     
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }   
     
    public Hero(){
        System.out.println("Hero���޲εĹ��췽�� ");
    }
     
    public Hero(String name){
        System.out.println("Hero����һ�������Ĺ��췽�� ");
        this.name = name;
    }
     
    public static void main(String[] args) {
        new Hero();
    }
      
}
//ʹ�ùؼ���super ��ʽ���ø�����εĹ��췽��
 	public class ADHero extends Hero implements AD{
  
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
     
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero�Ĺ��췽��");
    }
     
    public static void main(String[] args) {
        new ADHero("������");
    }
  
}
//���н��Ϊ�����Hero�вι���Ȼ�����ADHero���죬�Ⱥ����

//���ø�������
	public class ADHero extends Hero implements AD{
 
    int moveSpeed=400; //�ƶ��ٶ�
 
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
     
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
     
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
     
    public static void main(String[] args) {
        ADHero h= new ADHero();
         
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
         
    }
  
}
//���ø��෽��
	public class ADHero extends Hero implements AD {
 
    int moveSpeed = 400; // �ƶ��ٶ�
 
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
 
    public int getMoveSpeed() {
        return this.moveSpeed;
    }
 
    public int getMoveSpeed2() {
        return super.moveSpeed;
    }
 
    // ��дuserItem���������е��ø����userItem����
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }
 
    public static void main(String[] args) {
        ADHero h = new ADHero();
 
        LifePotion lp = new LifePotion();
 
    }
 
}
*/
}
