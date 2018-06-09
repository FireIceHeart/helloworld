package Object;
//声明一个类的时候，默认是继承了Object 
//public class Hero extends Object
public class Object类 {
	//toString
	/*public class Hero {
    public String name;
    protected float hp;
      
    public String toString(){
        return name;
    }
      
    public static void main(String[] args) {
         
        Hero h = new Hero();
        h.name = "盖伦";
        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);
    }
}
//equals() 用于判断两个对象的内容是否相同
	假设，当两个英雄的hp相同的时候，我们就认为这两个英雄相同

	public class Hero {
    public String name;
    protected float hp;
      
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }
      
    public static void main(String[] args) {
        Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;
         
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
    }
}
  == 这不是Object的方法，但是用于判断两个对象是否相同
   更准确的讲，用于判断两个引用，是否指向了同一个对象
   public class Hero {
    public String name;
    protected float hp;
      
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }
      
    public static void main(String[] args) {
        Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;
         
        System.out.println(h1==h2);
        System.out.println(h1==h3);
         
    }
}
*/
}
