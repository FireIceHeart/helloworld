package Object;

public class Hero {
	String name; //����
    
    float hp; //Ѫ��
      
    float armor; //����
      
    int moveSpeed; //�ƶ��ٶ�
    
    //����޲εĹ��췽���������д��
    //�ͻ�Ĭ���ṩһ���޲εĹ��췽��
     // public Hero(){ 
     //     System.out.println("����Hero�Ĺ��췽��");
     // }
  //�вεĹ��췽��
    //Ĭ�ϵ��޲εĹ��췽����ʧЧ�ˣ��ø÷�����Ч����Ĭ�ϵ��޲ι����ͻ���вι����û����
   //public Hero(String heroname){ 
    //    name = heroname;
   //} 
   
    
    public static void main(String[] args) {
        //����һ������
        new Hero();
         
        //ʹ��һ��������ָ���������
        Hero h = new Hero();
      //ʹ��һ��������ָ���������
        Hero h1 = new Hero();
        Hero h2 = h1;  //h2ָ��h1��ָ��Ķ���
        Hero h3 = h1;
        Hero h4 = h1;
        Hero h5 = h4;
         
        //h1,h2,h3,h4,h5 ������ã���ָ��ͬһ������
        
        
        Hero garen =  new Hero();
        garen.name = "����";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
         
        Hero teemo =  new Hero();
        teemo.name = "��Ī";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        
       // Hero none = new Hero("none");
      //��һ�������Ĺ��췽��
        }
}
