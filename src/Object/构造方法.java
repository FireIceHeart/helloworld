package Object;

public class 构造方法 {
//通过一个类创建一个对象，这个过程叫做实例化 
//实例化是通过调用构造方法(又叫做构造器)实现的
	String name;
    float hp;
    float armor;
    int moveSpeed;
    // 方法名和类名一样（包括大小写）
    // 没有返回类型
    public 构造方法() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }
	public static void main(String[] args) {
		//实例化一个对象的时候，必然调用构造方法
        构造方法 h = new 构造方法();
	}

}
