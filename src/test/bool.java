package test;

public class bool {

	public static void main(String[] args) {
		float height = 1.5F;
		if (height>1.2) {
			System.out.println("需要买票");
		}
		else {
			System.out.println("不需要买票");
		}
		int sa = 3000;
		int sb = 4500;
		int sd = 3500;
		if (sa>sd) {
			System.out.println("a交税");
		}
		else {
			System.out.println("a免税");
		}
		if (sb>sd) {
			System.out.println("b交税");
		}
		else {
			System.out.println("b免税");
		}
	
	}

}
