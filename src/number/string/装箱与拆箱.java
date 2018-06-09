package number.string;

public class 装箱与拆箱 {

	public static void main(String[] args) {
		/*所有的基本类型，都有对应的类类型 
		比如int对应的类是Integer 
		这种类就叫做封装类*/
		int i = 5;
		//把一个基本类型的变量，转换为Integer对象
		Integer it = new Integer(i);
		//把一个Integer对象，转换为一个基本类型int
		int i2 = it.intValue();
		/*数字封装类有 
		Byte,Short,Integer,Long,Float,Double 
		这些类都是抽象类Number的子类*/
		/*不需要调用构造方法，
		 * 通过=符号自动把 基本类型 转换为 类类型 就叫装箱*/
		Integer it2 = i;//自动转换就叫装箱
		/*不需要调用Integer的intValue方法，
		 * 通过=就自动转换成int类型，就叫拆箱*/
		int i3 = it;//自动转换就叫拆箱
		/*int的最大值可以
		 * 通过其对应的封装类Integer.MAX_VALUE获取*/
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE);
	}

}
