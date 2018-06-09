package Object;
/*首先，明确引用类型与对象类型的概念
在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
对象是有类型的， 是ADHero
引用也是有类型的，是ADHero
通常情况下，引用类型和对象类型是一样的
接下来要讨论的类型转换的问题，指的是引用类型和对象类型不一致的情况下的转换问题*/
public class 对象转型 {
	/*public class Hero {
    public String name;
    protected float hp; 
    public static void main(String[] args) {
        ADHero ad = new ADHero();    
    }
}
Hero h = new Hero();
ADHero ad = new ADHero();
h = ad;			
//右边ad引用所指向的对象的类型是 物理攻击英雄
	左边h引用的类型是 普通英雄
	把物理攻击英雄 当做 普通英雄，说不说得通？ 说得通，就可以转
	所有的子类转换为父类，都是说得通的。类似于基本数据的转型，高精度转低精度一定可以

//父类转子类
1.        Hero h =new Hero();
2.        ADHero ad = new ADHero();
3.        h = ad;
4.        ad = (ADHero) h;
第3行，是子类转父类，一定可以的
第4行，就是父类转子类，所以要进行强转。
h这个引用，所指向的对象是ADHero, 所以第4行，就会把ADHero转换为ADHero，就能转换成功。

1.        Hero h =new Hero();
2.        ADHero ad = new ADHero();
3.        Support s =new Support();
4.        h = s;
5.        ad = (ADHero)h;
第4行，是子类转父类，是可以转换成功的
第5行，是把h引用所指向的对象 Support，转换为ad引用的类型ADHero。
 从语义上讲，把物理攻击英雄，当成辅助英雄来用，说不通，所以会强制转换失败，并且抛出异常
 //实现类转换成接口
  引用ad指向的对象是ADHero类型，这个类型实现了AD接口
10行： 把一个ADHero类型转换为AD接口
从语义上来讲，把一个ADHero当做AD来使用，而AD接口只有一个physicAttack方法，
这就意味着转换后就有可能要调用physicAttack方法，而ADHero一定是有physicAttack方法的，所以转换是能成功的。
public class Hero {
    public String name;
    protected float hp;
       
    public static void main(String[] args) {
        ADHero ad = new ADHero();
          
        AD adi = ad;
          
    }
       
}
68行： ad引用指向ADHero， 而adi引用是接口类型：AD，实现类转换为接口，是向上转型，所以无需强制转换，并且一定能成功
70行: adi实际上是指向一个ADHero的，所以能够转换成功
72行： adi引用所指向的对象是一个ADHero，要转换为ADAPHero就会失败。 
假设能够转换成功，那么就可以使用magicAttack方法，而adi引用所指向的对象ADHero是没有magicAttack方法的。
public class Hero {
    public String name;
    protected float hp;
         
    public static void main(String[] args) {
        ADHero ad = new ADHero();
            
        AD adi = ad;
   
        ADHero adHero = (ADHero) adi;
            
        ADAPHero adapHero = (ADAPHero) adi;
        adapHero.magicAttack();
    }
         
}
//instanceof Hero 判断一个引用所指向的对象，是否是Hero类型，或者Hero的子类
 public class Hero {
    public String name;
    protected float hp;
      
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
         
        Hero h1= ad;
        Hero h2= ap;
         
        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);
         
        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);
         
        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);
    }
}
*/
}
