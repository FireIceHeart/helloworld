package variable;

public class 变量作用域 {
	/*当一个变量被声明在类下面
	变量就叫做字段 或者属性、成员变量、Field
	比如变量i,就是一个属性。
	那么从第10行这个变量声明的位置开始，整个类都可以访问得到
	所以其作用域就是从其声明的位置开始的整个类
*/
	int i = 1;
    int j = i;  //其他的属性可以访问i
    public void method1(){
        System.out.println(i); //方法1里可以访问i
    }
    public void method2(){
        System.out.println(i); //方法2里可以访问i
    }
    /*如果一个变量，是声明在一个方法上的，就叫做参数
	参数的作用域即为该方法内的所有代码
	其他方法不能访问该参数
	类里面也不能访问该参数*/
    public void method3(int h){ //参数h的作用域即方法method3
        System.out.println(h);
    }
    public void method4(){
 
 //      System.out.println(h); //method4 不能访问参数h
    }
     /*声明在方法内的变量，叫做局部变量 
	其作用域在声明开始的位置，到其所处于的块结束位置*/
 //   int f = h;  //类里面也不能访问参数h
    public void method5() {
        int a  = 5;  //其作用范围是从声明的第32行，到其所处于的块结束40行位置
        System.out.println(a);
        {            //子块
            System.out.println(a); //可以访问a
            int b = 6;
            System.out.println(b); //可以访问b
        }
  //      System.out.println(b); //不能访问b,因为其作用域到第38行就结束了
    }
    
    
    int c = 1; //属性名是i
    public void method1(int c){ //参数也是i
        System.out.println(c);
    }
     
    public static void main(String[] args) {
        new 变量作用域().method1(5);
        //结果打印出来是 1还是5?输出是5，当访问的变量被多个作用域影响的时候，按照就近原则取
    }
    
    //常量：当一个变量被final修饰的时候，该变量只有一次赋值的机会
    public void method6() {
        final int V = 5;  
//        v = 10; //v已经被赋值过了，所以这里会出现编译错误     
    }
    
    public void method7() {
        final int N;
         
        N = 10; //n只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值
    }
         
//        N = 11; //n已经被赋值过了，所以这里会出现编译错误
    //如果final修饰的是参数，能否在方法里给这个参数赋值？
    //不可以，因为在调用方法的时候，就一定会第一次赋值了，后面不能再进行多次赋值
    /*public void method8(final int M) {
           M = 5; //这个能否执行？
        }
    }*/

}