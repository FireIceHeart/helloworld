package Object;

public class ����ģʽ {
	//����ģʽ�ֽ��� Singletonģʽ��ָ����һ���࣬��һ��JVM�ֻ��һ��ʵ�����ڡ�
	/*GiantDragon Ӧ��ֻ��һֻ��ͨ��˽�л��乹�췽����
	 * ʹ���ⲿ�޷�ͨ��new �õ��µ�ʵ����
	GiantDragon �ṩ��һ��public static��getInstance������
	�ⲿ������ͨ���÷�����ȡ12�ж���Ķ���
	����ÿһ�ζ��ǻ�ȡͬһ������ �Ӷ��ﵽ������Ŀ�ġ�
	���ֵ���ģʽ�ֽ�������ʽ����ģʽ��������ζ��ᴴ��һ��ʵ��*/
	/*public class GiantDragon {
 
    //˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
    private GiantDragon(){
         
    }
 
    //׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
 
    private static GiantDragon instance = new GiantDragon();
     
    //public static �������ṩ�������߻�ȡ12�ж���Ķ���
    public static GiantDragon getInstance(){
        return instance;
    }
     
}

	public class TestGiantDragon {
 
    	public static void main(String[] args) {
        	//ͨ��newʵ�����ᱨ��
//      	GiantDragon g = new GiantDragon();
         
        	//ֻ��ͨ��getInstance�õ�����
         
        	GiantDragon g1 = GiantDragon.getInstance();
        	GiantDragon g2 = GiantDragon.getInstance();
        	GiantDragon g3 = GiantDragon.getInstance();
         
        	//����ͬһ������
        	System.out.println(g1==g2);
        	System.out.println(g1==g3);
    	}
}
*/
	
	
	//����ʽ����ģʽ�����ʽ����ģʽ��ͬ��ֻ���ڵ���getInstance��ʱ�򣬲Żᴴ��ʵ��
	/*public class GiantDragon {
  
    //˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
    private GiantDragon(){       
    }
  
    //׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
    private static GiantDragon instance;
      
    //public static ����������ʵ������
    public static GiantDragon getInstance(){
        //��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
        if(null==instance){
            instance = new GiantDragon();
        }
        //���� instanceָ��Ķ���
        return instance;
    }
      
}*/
	/*����ʽ���������صķ�ʽ�������Ƿ���õ�������󣬶�����ء�
����ڹ��췽����д���������Ľϴ�ռʱ�ϾõĴ��룬���罨�������ݿ�����ӣ���ô�ͻ���������ʱ��о���΢��Щ���١�

����ʽ�����ӳټ��صķ�ʽ��ֻ��ʹ�õ�ʱ��Ż���ء� �������̰߳�ȫ�Ŀ���(����ͬѧ��ѧϰ�Ľ��ȣ���ʱ�����̵߳��½���չ��)��
ʹ������ʽ����������ʱ�򣬻�о����ȶ���ʽ�Կ죬��Ϊ��û���������ʵ������ �����ڵ�һ�ε��õ�ʱ�򣬻����ʵ�����������о��Ͼ�������

��ҵ���������ҵ���������бȽϳ�ֵ������ͳ�ʼ��ʱ�䣬��ʹ�ö���ʽ�������ʹ������ʽ*/
}
