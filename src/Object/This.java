package Object;

public class This {
/*this����ؼ��֣��൱����ͨ����ġ��ҡ� 

С��˵ ���ҳ��ˡ� ���ʱ�򣬡��ҡ� ����С�� 
С��˵ ���ҳ��ˡ� ���ʱ�򣬡��ҡ� ����С�� 
"��"����ǰ���� 

this����ؼ��֣��൱����ͨ����ġ��ҡ� 
this������ǰ����*/
	//���Ҫ��һ�����췽���У�������һ�����췽��������ʹ��this()
	String name; //����
	float hp; //Ѫ��
	float armor; //����        
	int moveSpeed; //�ƶ��ٶ�
	//��һ�������Ĺ��췽��
    public This(String name){
        System.out.println("һ�������Ĺ��췽��");
        this.name = name;
    }
      
    //�����������Ĺ��췽��
    public This(String name,float hp){
        this(name);
        System.out.println("���������Ĺ��췽��");
        this.hp = hp;
    }
	public static void main(String[] args) {
		 This teemo =  new This("��Ī",383);
	     System.out.println(teemo.name);
	}

}
