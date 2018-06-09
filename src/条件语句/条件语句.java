package 条件语句;

public class 条件语句 {

	public static void main(String[] args) {
		//if else
		boolean a = false;
		if (a) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		//如果有多个表达式，必须用大括弧包括起来
        if(a){
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }
         
        //否则表达式2 3 无论b是否为true都会执行
         
        if(a)
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
       //else if 是多条件判断
          //如果只使用 if,会执行4次判断
            int i = 2;
            if (i==1)
                System.out.println(1);
            if (i==2)
                System.out.println(2);
            if (i==3)
                System.out.println(3);
            if (i==4)
                System.out.println(4);
             
            //如果使用else if, 一旦在42行，判断成立， 44行和46行的判断就不会执行了，节约了运算资源
            if (i==1)
                System.out.println(1);
            else if (i==2)
                System.out.println(2);
            else if (i==3)
                System.out.println(3);
            else if (i==4)
                System.out.println(4);
            //switch语句
            /*switch可以使用byte,short,int,char,String,enum
			注: 每个表达式结束，都应该有一个break;
			注: String在Java1.7之前是不支持的, Java从1.7开始支持switch用String的，编译后是把String转化为hash值，其实还是整数
			注: enum是枚举类型，在枚举章节有详细讲解*/
            int day = 5;
            switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
            }
            /*可以使多个case只执行一个表达式 例如 
            case 1:
            case 2:
            case 3:
            	System.out.println("yes");
            	break;
            */
            //while语句，只要条件成立会不断循环执行
            int A = 2;
            while(A<5){
            	System.out.println(A);
            	A++;
            }
            //与while的区别是，无论是否成立，先执行一次，再进行判断
            int B = 1;
            do{
            	System.out.println(B);
            	B++;
            }
            while(B<5);
            //for
            //括号里包含表达式1；2；3，1未设置初始值，2为设置范围，3为自增或自减，执行顺序为：
            //先执行1，然后判断2，若为真，执行大括号内语句，（若为假，循环结束）然后执行3
            for (int j=0; j<5; j++){
            	System.out.println("for输出：" + j);
            }
            //foreach语句，主要用于遍历数组
            //for(循环变量x : 遍历对象obj){引用了x的语句}
            int arr[] = {5,9,12};
            for (int x : arr){
            	System.out.println(x);
            }
            //continue 继续下一次循环
            //打印单数
            for (int J=0; J<20; J++){
            	if(0==J%3 || 0==J%5)
            		continue;
            	System.out.println(J);
            	//如果是双数，后面的代码不执行，直接进行下一次循环
            }
            //break 结束循环
            //打印单数
            for (int k=1; k<10; k++){
            	if(0==k%2)
            		break;//如果是双数直接结束循环
            	System.out.println(k);
            }
            //for 嵌套 外层循环先开始 z =0 x =0 x = 1 ...x=9; z=1 x=0...
            for (int z = 0; z < 10; z++) {
                
                for (int x = 0; x < 10; x++) {
                    System.out.println(z+":"+x);
                    if(0==x%2) 
                        break; //如果是双数，结束当前循环
                }  
            }
            //使用标签结束循环，同样适用于continue
            outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
                for (int v = 0; v < 10; v++) {
                     
                    for (int q = 0; q < 10; q++) {
                        System.out.println(v+":"+q);
                        if(0==q%2) 
                            break outloop; //如果是双数，结束外部循环
                    }
                     
                }
            
	}

}
