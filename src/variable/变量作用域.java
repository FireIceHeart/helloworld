package variable;

public class ���������� {
	/*��һ��������������������
	�����ͽ����ֶ� �������ԡ���Ա������Field
	�������i,����һ�����ԡ�
	��ô�ӵ�10���������������λ�ÿ�ʼ�������඼���Է��ʵõ�
	��������������Ǵ���������λ�ÿ�ʼ��������
*/
	int i = 1;
    int j = i;  //���������Կ��Է���i
    public void method1(){
        System.out.println(i); //����1����Է���i
    }
    public void method2(){
        System.out.println(i); //����2����Է���i
    }
    /*���һ����������������һ�������ϵģ��ͽ�������
	������������Ϊ�÷����ڵ����д���
	�����������ܷ��ʸò���
	������Ҳ���ܷ��ʸò���*/
    public void method3(int h){ //����h�������򼴷���method3
        System.out.println(h);
    }
    public void method4(){
 
 //      System.out.println(h); //method4 ���ܷ��ʲ���h
    }
     /*�����ڷ����ڵı����������ֲ����� 
	����������������ʼ��λ�ã����������ڵĿ����λ��*/
 //   int f = h;  //������Ҳ���ܷ��ʲ���h
    public void method5() {
        int a  = 5;  //�����÷�Χ�Ǵ������ĵ�32�У����������ڵĿ����40��λ��
        System.out.println(a);
        {            //�ӿ�
            System.out.println(a); //���Է���a
            int b = 6;
            System.out.println(b); //���Է���b
        }
  //      System.out.println(b); //���ܷ���b,��Ϊ�������򵽵�38�оͽ�����
    }
    
    
    int c = 1; //��������i
    public void method1(int c){ //����Ҳ��i
        System.out.println(c);
    }
     
    public static void main(String[] args) {
        new ����������().method1(5);
        //�����ӡ������ 1����5?�����5�������ʵı��������������Ӱ���ʱ�򣬰��վͽ�ԭ��ȡ
    }
    
    //��������һ��������final���ε�ʱ�򣬸ñ���ֻ��һ�θ�ֵ�Ļ���
    public void method6() {
        final int V = 5;  
//        v = 10; //v�Ѿ�����ֵ���ˣ������������ֱ������     
    }
    
    public void method7() {
        final int N;
         
        N = 10; //nֻ�Ǳ�����������û�б���ֵ��������������Խ��е�һ�θ�ֵ
    }
         
//        N = 11; //n�Ѿ�����ֵ���ˣ������������ֱ������
    //���final���ε��ǲ������ܷ��ڷ���������������ֵ��
    //�����ԣ���Ϊ�ڵ��÷�����ʱ�򣬾�һ�����һ�θ�ֵ�ˣ����治���ٽ��ж�θ�ֵ
    /*public void method8(final int M) {
           M = 5; //����ܷ�ִ�У�
        }
    }*/

}