package test;

public class minnum {

	public static void main(String[] args) {
		int[] a = new int[10];
        int minNum;     //��С��
        //��ѭ�����������
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println("�����еĸ����������:");
        //�����һ����Ϊ��Сֵ
        minNum = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            //�����Сֵ���������������ֵ�Ͱ����ֵ����MinNum��
            if(minNum > a[i]){
                minNum = a[i];
            }
        }
         
        System.out.println("��С��Ϊ:"+minNum);
	}

}
