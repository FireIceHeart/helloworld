package number.string;

public class װ������� {

	public static void main(String[] args) {
		/*���еĻ������ͣ����ж�Ӧ�������� 
		����int��Ӧ������Integer 
		������ͽ�����װ��*/
		int i = 5;
		//��һ���������͵ı�����ת��ΪInteger����
		Integer it = new Integer(i);
		//��һ��Integer����ת��Ϊһ����������int
		int i2 = it.intValue();
		/*���ַ�װ���� 
		Byte,Short,Integer,Long,Float,Double 
		��Щ�඼�ǳ�����Number������*/
		/*����Ҫ���ù��췽����
		 * ͨ��=�����Զ��� �������� ת��Ϊ ������ �ͽ�װ��*/
		Integer it2 = i;//�Զ�ת���ͽ�װ��
		/*����Ҫ����Integer��intValue������
		 * ͨ��=���Զ�ת����int���ͣ��ͽв���*/
		int i3 = it;//�Զ�ת���ͽв���
		/*int�����ֵ����
		 * ͨ�����Ӧ�ķ�װ��Integer.MAX_VALUE��ȡ*/
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE);
	}

}
