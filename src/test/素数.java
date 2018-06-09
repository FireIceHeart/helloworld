package test;

public class ËØÊı {
	public static void prime(){
		for(int i =2;i<=1000;i++){
			int p = 0;
			for(int j = 2;j<i;j++){
				if(i%j==0){
					p=1;
				}
			}
			if(p==0){
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		//prime();
		System.out.println(95000%10000/1000);
	}

}
