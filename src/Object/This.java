package Object;

public class This {
/*this这个关键字，相当于普通话里的“我” 

小明说 “我吃了” 这个时候，“我” 代表小明 
小红说 “我吃了” 这个时候，“我” 代表小红 
"我"代表当前人物 

this这个关键字，相当于普通话里的“我” 
this即代表当前对象*/
	//如果要在一个构造方法中，调用另一个构造方法，可以使用this()
	String name; //姓名
	float hp; //血量
	float armor; //护甲        
	int moveSpeed; //移动速度
	//带一个参数的构造方法
    public This(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }
      
    //带两个参数的构造方法
    public This(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }
	public static void main(String[] args) {
		 This teemo =  new This("提莫",383);
	     System.out.println(teemo.name);
	}

}
