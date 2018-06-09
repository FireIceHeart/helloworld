package LOL;

public class Hero {// Hero 类名
	//属性：
	String name;//姓名 字符串
	float hp;//血量 浮点数
	float armor;//护甲
	int moveSpeed;//移动速度 整数
	int kill;
	int death;
	int assitant;
	//方法：坑队友
	void keng(){ //void 无返回值
		System.out.println("坑队友");
	}
	//方法：获取护甲值
	float getArmor(){
		return armor;//有返回值，返回浮点数
	}
	//增加移动速度，小括号内为参数
	void addSpeed(int speed){
		//在原基础上增加移速
		moveSpeed = moveSpeed + speed;
	}
	//超神
	void legendary(){
		System.out.println("超神！");
	}
	//获取当前血量
	float getHP(){
		return hp;
	}
	//回血
	void recovery(float blood){
		hp = hp + blood;
	}
	//super
	 public Hero(){
	        System.out.println("Hero的无参的构造方法 ");
	    }
	     
	 public Hero(String name){
	       System.out.println("Hero的有一个参数的构造方法 ");
	       this.name = name;
	   }
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.recovery(50);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		new Hero();
	}
}
