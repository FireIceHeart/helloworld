package test;

public class ��������ת�� {

	public static void main(String[] args) {
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte and float:" + (mybyte + +myfloat));
		System.out.println("byte and int:" + mybyte * myint);
		System.out.println("byte and char:" + mybyte / mychar);
		System.out.println("double and char:" + (mydouble + mychar));
		//����ת�����;���תΪ�߾���
		int x = 50;
		float y = x;
		char a = 'a';
		char b = 'b';
		System.out.println(a + b);
		//��ʽת��
		int A = (int) 45.23;
		long B = (long) 456.6f;
		char C = (char) 97.14;
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}

}
