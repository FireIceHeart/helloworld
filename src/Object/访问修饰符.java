package Object;

public class 访问修饰符 {
//成员变量有四种修饰符 
	//private 私有的 
	//package/friendly/default 默认，不写 例如 float hp;
	//protected 受保护的 
	//public 公共的 
	/*类之间的关系：
	 * 自身，指类本身
	 *同包子类，在同一个包下的继承自身的子类 ，比如weapon就是item的同包子类
	 *不同包子类，字面意思
	 *同包类，在同一个包下的没有继承关系的类
	 *其他类，不在一个包也无继承关系*/
	//private 私有，只能在该类下访问
	//package/friendly/default不写 只有自身和同包、同包子类可访问
	//protected 只有其他类不可访问，其他的都可以
	//public 全体可访问
	/*1. 属性通常使用private封装起来
	2. 方法一般使用public用于被调用
	3. 会被子类继承的方法，通常使用protected
	4. package用的不多，一般新手会用package,因为还不知道有修饰符这个东西
	作用范围最小原则
	简单说，能用private就用private，
	不行就放大一级，用package,再不行就用protected，
	最后用public。 这样就能把数据尽量的封装起来，没有必要露出来的，就不用露出来了*/

}
