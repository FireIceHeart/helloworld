package test;

public class ì³²¨ÄÇÆõÊıÁĞ {

	public static void main(String[] args) {
		int[] a = new int[11];
		a[0] = 1;
		a[1] = 1;
		for(int i=2;i<=10;i++){
			 a[i] = a[i-1]+a[i-2];
			System.out.println(a[i]);
		}
		
	}

}
