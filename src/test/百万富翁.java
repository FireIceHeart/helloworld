package test;

public class ������ {

	public static void main(String[] args) {
		double m = 0;
		float l = 1.2f;
		float ly=1;
		double fm;
		int y;
		for (y=1; y<100; y++){
			m = m + 12000;//ÿ����Ͷ12000
			ly = ly*l;
			fm = m*ly;
			if(fm>1000000){
				System.out.println("��"+y+"���Ϊ������");
				System.out.println("��"+y+"��"+"����Ϊ��"+fm+"Ԫ");
				break;
			}
		}
		
	}

}
