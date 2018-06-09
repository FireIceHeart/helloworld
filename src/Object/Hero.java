package Object;

public class Hero {
	String name; //姓名
    
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
    
    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
     // public Hero(){ 
     //     System.out.println("调用Hero的构造方法");
     // }
  //有参的构造方法
    //默认的无参的构造方法就失效了，让该方法生效会与默认的无参构造冲突，有参构造的没问题
   //public Hero(String heroname){ 
    //    name = heroname;
   //} 
   
    
    public static void main(String[] args) {
        //创建一个对象
        new Hero();
         
        //使用一个引用来指向这个对象
        Hero h = new Hero();
      //使用一个引用来指向这个对象
        Hero h1 = new Hero();
        Hero h2 = h1;  //h2指向h1所指向的对象
        Hero h3 = h1;
        Hero h4 = h1;
        Hero h5 = h4;
         
        //h1,h2,h3,h4,h5 五个引用，都指向同一个对象
        
        
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
         
        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        
       // Hero none = new Hero("none");
      //带一个参数的构造方法
        }
}
