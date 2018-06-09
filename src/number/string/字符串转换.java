package number.string;

public class 字符串转换 {

	public static void main(String[] args) {
		//数字转字符串
		int i = 5;
		//方法1
		String str = String.valueOf(i);
		//方法2
		Integer it = i;
		String str2 = it.toString();
		//字符串转数字
		String str3 = "999";
		int j = Integer.parseInt(str);
		System.out.println(j);
		//四舍五入，随机数，开发，次方，π，自然常数
		float f1 = 5.4f;
		float f2 = 5.5f;
		System.out.println(Math.round(f1));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.PI);
		System.out.println(Math.E);//自然常数
	}

}
