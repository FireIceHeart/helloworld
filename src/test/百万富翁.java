package test;

public class 百万富翁 {

	public static void main(String[] args) {
		double m = 0;
		float l = 1.2f;
		float ly=1;
		double fm;
		int y;
		for (y=1; y<100; y++){
			m = m + 12000;//每年增投12000
			ly = ly*l;
			fm = m*ly;
			if(fm>1000000){
				System.out.println("第"+y+"年成为百万富翁");
				System.out.println("第"+y+"年"+"收入为："+fm+"元");
				break;
			}
		}
		
	}

}
