package Object;

public class SUPER关键字 {
/*准备显式提供无参构造方法的父类 
	在实例化Hero对象的时候，其构造方法会打印 
	“Hero的构造方法 "*/
	/*import property.Item;
 
public class Hero {
        
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
     
    public Hero(){
        System.out.println("Hero的构造方法 ");
    }
     
    public static void main(String[] args) {
        new Hero();
    }
      
}
实例化一个ADHero(), 其构造方法会被调用 
其父类的构造方法也会被调用 
并且是父类构造方法先调用 
子类构造方法会默认调用父类的 无参的构造方法
public class ADHero extends Hero implements AD{
  
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
     
    public ADHero(){
         
        System.out.println("AD Hero的构造方法");
    }
     
    public static void main(String[] args) {
 
        new ADHero();
         
    }
  
}
//先输出Hero的构造方法，在输出ADHero的构造方法
 * 
 父类创造分别是无参的构造方法和带一个参数的构造方法
 	import property.Item;
 
public class Hero {
        
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }   
     
    public Hero(){
        System.out.println("Hero的无参的构造方法 ");
    }
     
    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
     
    public static void main(String[] args) {
        new Hero();
    }
      
}
//使用关键字super 显式调用父类带参的构造方法
 	public class ADHero extends Hero implements AD{
  
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
     
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }
     
    public static void main(String[] args) {
        new ADHero("德莱文");
    }
  
}
//运行结果为先输出Hero有参构造然后输出ADHero构造，先后调用

//调用父类属性
	public class ADHero extends Hero implements AD{
 
    int moveSpeed=400; //移动速度
 
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
     
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
     
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
     
    public static void main(String[] args) {
        ADHero h= new ADHero();
         
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
         
    }
  
}
//调用父类方法
	public class ADHero extends Hero implements AD {
 
    int moveSpeed = 400; // 移动速度
 
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
 
    public int getMoveSpeed() {
        return this.moveSpeed;
    }
 
    public int getMoveSpeed2() {
        return super.moveSpeed;
    }
 
    // 重写userItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }
 
    public static void main(String[] args) {
        ADHero h = new ADHero();
 
        LifePotion lp = new LifePotion();
 
    }
 
}
*/
}
