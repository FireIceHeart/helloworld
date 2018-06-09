package Object;

public class 抽象类 {
/*在类中声明一个方法，这个方法没有实现体，是一个“空”方法 
这样的方法就叫抽象方法，使用修饰符“abstract" 
当一个类有抽象方法的时候，该类必须被声明为抽象类

为Hero增加一个抽象方法 attack，并且把Hero声明为abstract的。
APHero,ADHero,ADAPHero是Hero的子类，继承了Hero的属性和方法。
但是各自的攻击手段是不一样的，所以继承Hero类后，这些子类就必须提供不一样的attack方法实现。

Hero类可以在不提供抽象方法的前提下，声明为抽象类 
一旦一个类被声明为抽象类，就不能够被直接实例化
public abstract class Hero {
    String name;
          
    float hp;
          
    float armor;
          
    int moveSpeed;
       
    public static void main(String[] args) {
        //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
        Hero h= new Hero();
    }
          
}

区别1：
子类只能继承一个抽象类，不能继承多个
子类可以实现多个接口
区别2：
抽象类可以定义
public,protected,package,private
静态和非静态属性
final和非final属性
但是接口中声明的属性，只能是
public
静态
final的
即便没有显示的声明

注: 抽象类和接口都可以有实体方法。 接口中的实体方法，叫做默认方法

public interface AP {
  
    public static final int resistPhysic = 100;
     
    //resistMagic即便没有显式的声明为 public static final
    //但依然默认为public static final
    int resistMagic = 0;
     
    public void magicAttack();
}
*/
	
}
