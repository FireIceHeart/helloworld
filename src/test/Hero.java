package test;

public class Hero {
/*�������Եĳ�ʼ�������ַ�ʽ
����ѳ�ʼ���飬���ڹ��췽�����棬���⣺

�����ַ�ʽ��˭��ִ�У�˭��ִ�У�*/
	 public String name =Hero.getName("��������") ;
     
	    public Hero(){
	        name = Hero.getName("���췽��");
	    }
	    {
	        name = Hero.getName("��ʼ����");
	    }
	     
	    public static String getName(String pos){
	        String result= "name "+pos;
	        System.out.println(result);
	        return result;
	    }
	     
	    public static void main(String[] args) {
	        new Hero();
	    }

}
