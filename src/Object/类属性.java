package Object;

public class 类属性 {
/*当一个属性被static修饰的时候，就叫做类属性，又叫做静态属性 
当一个属性被声明成类属性，那么所有的对象，都共享一个值 
与对象属性对比： 
不同对象的 对象属性 的值都可能不一样。 
比如盖伦的hp 和 提莫的hp 是不一样的。 
但是所有对象的类属性的值，都是一样的*/
	
/*类属性： 又叫做静态属性 
对象属性： 又叫实例属性，非静态属性 
如果一个属性声明成类属性，那么所有的对象，都共享这么一个值 
给英雄设置一个类属性叫做“版权" (copyright), 
无论有多少个具体的英雄，所有的英雄的版权都属于 Riot Games公司。
类属性类似于JS的全局变量*/
	/*public class Hero {
    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性
     
    public static void main(String[] args) {
           Hero garen =  new Hero();
           garen.name = "盖伦";
            
           Hero.copyright = "版权由Riot Games公司所有";
            
           System.out.println(garen.name);
           System.out.println(garen.copyright);
            
           Hero teemo =  new Hero();
           teemo.name = "提莫";
           System.out.println(teemo.name);    
           System.out.println(teemo.copyright);
         
    }
     //访问类属性有两种方式： 
      * 对象.类属性 teemo.copyright
      *   类.类属性 Hero.copyright 建议使用这种
      *   何时使用类属性与对象属性：如果一个属性每个对象都不一样
      *   例如英雄的名字，name不同，要用对象属性
      *   有些属性是共有统一的，如血量上限9999，那就用类属性
      *   如果修改了类属性，例如garen.copyright="bz",
      *   打印teemo.copyright 也会变成bz ，一改全改
}*/

}
