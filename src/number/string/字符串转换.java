package number.string;

public class �ַ���ת�� {

	public static void main(String[] args) {
		//����ת�ַ���
		int i = 5;
		//����1
		String str = String.valueOf(i);
		//����2
		Integer it = i;
		String str2 = it.toString();
		//�ַ���ת����
		String str3 = "999";
		int j = Integer.parseInt(str);
		System.out.println(j);
		//�������룬��������������η����У���Ȼ����
		float f1 = 5.4f;
		float f2 = 5.5f;
		System.out.println(Math.round(f1));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.PI);
		System.out.println(Math.E);//��Ȼ����
	}

}
