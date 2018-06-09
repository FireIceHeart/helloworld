package test;

public class Hero {
/*对象属性的初始化有三种方式
故意把初始化块，放在构造方法下面，问题：

这三种方式，谁先执行？谁后执行？*/
	 public String name =Hero.getName("属性声明") ;
     
	    public Hero(){
	        name = Hero.getName("构造方法");
	    }
	    {
	        name = Hero.getName("初始化块");
	    }
	     
	    public static String getName(String pos){
	        String result= "name "+pos;
	        System.out.println(result);
	        return result;
	    }
	     
	    public static void main(String[] args) {
	        new Hero();
	    }

}
