package variable;

public class variable {

	public static void main(String[] args) {
		int year = 1949; 
		/*int ���������ͣ���ʾ������ 
		 * year ��һ����ʶ��
		 * = �Ǹ�ֵ������
		 * 1949 ��һ���������͵�ֵ
		 * ; ��ʾ���н���
		*/
		//������������������������ֵ��������ֵ��
		//������������
		byte b = 1; //-128-127 2^8
		short s = 200;//-32,768-32,767 2^16
		int i = 300;//2,147,483,648-2,147,483,647 2^32
		long l = 400L;//2^64
		/*�����ͼ��byte���͵ı������賬���䷶Χ��ֵ���ͻ�����������*/
		//byte b2 = 200;
		//�ַ���
		char c = '��';
	      //char ֻ�ܴ��һ���ַ�������һ���ַ��ͻ�����������
	      //char c2 = '�й�'; //����
	      //char c3 = 'ab'; //����
		// \��ʾת��
		char tab = '\t';//�Ʊ��
		char carriageReturn = '\r'; //�س�
	    char newLine = '\n'; //����
	    char doubleQuote = '\"'; //˫����
	    char singleQuote = '\''; //������
	    char backslash = '\\'; //��б��
	    //������
	    //float/double 32λ��64λ С��Ĭ��Ϊdouble����
	     double d = 123.45;
	     //float f = 54.321;
	     /* float f = 54.321����ֱ��������Ϊ54.321��Ĭ�������� double��
	      * ������ ����Ϊ64��������float�ĳ���32 
			�����ֺ����һ����ĸf��ֱ�ӰѸ�����������float���� */
	     float f2 = 54.321f;
	   //������
	     boolean b1 = true;
	     boolean b2 = false;
	  // ��Ȼ������������ŵ�������0(false) 1(true)
	  // ���ǣ�����ֱ��ʹ��0 1 ���и�ֵ
	  //String String������ʵ�����ǻ�������
	     String str = "hello";
	 //��ϰ
	     double p = 3.14;
	     float m = 2.769343f;
	     int D = 365;
	     byte t = 12;
	     char e = '��';
	     boolean fa = false;
	     String ud = "��������";
	     
	 //����ת��
	     char A = 'A';
	     short S = 80;
	     A = (char) S;//char A = 80 ��ӦUnicode��80λ�����Ϊ��ĸP
	   //��Ȼshort��char����16λ�ģ�������һ����
	   //���Ǳ˴�֮�䣬��Ȼ��Ҫ����ǿ��ת�� S = A����
	     System.out.println(A);
	     long L = 50;
	     int I = 50;
	     L = I;
	   //int�Ƚ�С��Ҫ�Ž��Ƚϴ��long,�����ô�������ŵĽ�ȥ
	     byte B = 5;
	        int i1 = 10;
	        int i2 = 300;
	          
	        B = (byte) i1;
	        //��Ϊi1��ֵ����byte��Χ֮�ڣ����Լ������ǿ��ת��
	        //���õ���ֵ��Ҳ��10
	        System.out.println(B);
	          
	        //��Ϊi2��ֵ����byte��Χ֮�⣬���Ծͻᰴ��byte�ĳ��Ƚ��н�ȡ
	        //i2��ֵ��300�����Ӧ�Ķ��������� 100101100
	        //����byte�ĳ���8λ���н�ȡ����ֵΪ 00101100 ��44
	        B =(byte) i2;
	        System.out.println(B);
	        
	}
}
