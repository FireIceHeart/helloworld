package Object;

public class final修饰词 {
/*当Hero被修饰成final的时候，表示Hero不能够被继承
其子类会出现编译错误*/
	/*public final class Hero extends Object {
        
	    String name; //姓名
	        
	    float hp; //血量
	        
	}
	Hero的useItem方法被修饰成final,那么该方法在ADHero中，不能够被重写
	final修饰基本类型变量，表示该变量只有一次赋值机会 
	public static void main(String[] args) {
 
        final int hp;
        hp = 5;
        hp = 6;
         
    }
    final修饰引用
	h引用被修饰成final，表示该引用只有1次指向对象的机会
	public static void main(String[] args) {
 
        final Hero h;
        h  =new Hero();
        h  =new Hero();
         
        h.hp = 5;
       但是，依然通过h引用修改对象的属性值hp，因为hp并没有final修饰  
    }
        常量指的是可以公开，直接访问，不会变化的值 
	比如 itemTotalNumber 物品栏的数量是6个
	 public static final int itemTotalNumber = 6;//物品栏的数量
	*/
}
