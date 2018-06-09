package Object;

public class 枚举类型 {
//枚举enum是一种特殊的类(还是类)，使用枚举可以很方便的定义常量
//	比如设计一个枚举类型 季节，里面有4种常量
//使用枚举，就能把范围死死的限定在这四个当中，可以不用default
	public enum Season {
	SPRING,SUMMER,AUTUMN,WINTER
}
	public enum Hero {
		TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING;
	}
/*一个常用的场合就是switch语句中，使用枚举来进行判断
注：因为是常量，所以一般都是全大写*/
	public static void main(String[] args) {
		Season season = Season.SPRING;
        switch (season) {
        case SPRING:
            System.out.println("春天");
            break;
        case SUMMER:
            System.out.println("夏天");
            break;
        case AUTUMN:
            System.out.println("秋天");
            break;
        case WINTER:
            System.out.println("冬天");
            break;
        }
        Hero hero = Hero.TANK;
        switch(hero) {
        case TANK:
        	System.out.println("坦克");
        	break;
        case WIZARD:
        	System.out.println("法师");
        	break;
        case ASSASSIN:
        	System.out.println("刺客");
        	break;
        case ASSIST:
        	System.out.println("辅助");
        	break;
        case WARRIOR:
        	System.out.println("近战");
        	break;
        case RANGED:
        	System.out.println("远程");
        	break;
        case PUSH:
        	System.out.println("推进");
        	break;
        case FARMING:
        	System.out.println("打野");
        	break;
        }
	}

}
