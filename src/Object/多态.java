package Object;

public class 多态 {
/*操作符的多态 
	+ 可以作为算数运算，也可以作为字符串连接
	类的多态 
	父类引用指向子类对象*/
	//类的多态，执行同一个effect方法却输出不同结果
	/*public class LifePotion extends Item {
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
    public class MagicPotion extends Item{
 
    public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}
public class Item {
    String name;
    int price;
 
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果 ");
    }
     
    public static void main(String[] args) {
        Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();
    }
 //要实现类的多态，需要如下条件
1. 父类（接口）引用指向子类对象
2. 调用的方法有重写

package charactor;
 
import property.Item;
import property.LifePotion;
import property.MagicPotion;
   
public class Hero {
    public String name;
    protected float hp;
 
    public void useItem(Item i){
        i.effect();
    }
 
    public static void main(String[] args) {
         
        Hero garen =  new Hero();
        garen.name = "盖伦";
     
        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();
         
        garen.useItem(lp);
        garen.useItem(mp);     
         
    }
       
}
}
}*/
}
