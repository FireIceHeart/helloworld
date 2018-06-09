package oprator;

public class op {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int c = a + b;
		int d = b - a;
		int e = a * b;
		int f = a / b;
		int g = 20;
		long h = 12;
		int i = (int) (g + h);//g+h结果是long型，要强制转换
		long j = g + h;
		byte k = 2;
		byte l = 4;
		byte m = (byte) (k + l);//k+l默认是int，要强制转换
		System.out.println(l%k);//取余运算 输出0
		//自增 ++
		//i++; 先取值，再运算 ++i; 先运算，再取值
		int n = 9;
		int o = 3;
		System.out.println(o++);
		System.out.println(o);
		System.out.println(++n);
		//比较运算符
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		//逻辑运算符
		//与运算，（对）&&（错）=错 （对）&&（对）=对  一假必假!
		//长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int p = 2;
        System.out.println( p== 1 & p++ ==2  ); //无论如何p++都会被执行，所以p的值变成了3
        System.out.println(p);
         
        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int q = 2;
        System.out.println( q== 1 && q++ ==2  );  //因为q==1返回false,所以右边的q++就没有执行了，所以q的值，还是2
        System.out.println(q);
        //或运算 （对）||（错）=对 一真必真！
        //长短路或运算 同和运算
        System.out.println( p== 1 | p++ ==2  ); 
        System.out.println(p);
        System.out.println( p== 1 || p++ ==2  ); 
        System.out.println(p);
        //取反 ！
        boolean r = true;
        System.out.println(!r);
        //异或 ^ 不同为真，相同为假
        boolean s = false;
        System.out.println(r^s);
        System.out.println(r^!s);
        //位运算符：
        //位或运算 
        //5的二进制是101 
        //6的二进制是110 
        //所以 5|6 对每一位进行或运算，得到 111->7
        
        //位与运算
        //5的二进制是101 
        //6的二进制是110 
        //所以 5&6 对每一位进行与运算，得到 100->4
        
        //异或运算
        //5的二进制是101
        //6的二进制是110
        //所以 5^6 对每一位进行异或运算，得到 011->3

        //一些特别情况：
        //任何数和自己进行异或 都等于 0
        //任何数和0 进行异或 都等于自己
        
        //取非运算
        //5 的二进制是 00000101
        //所以取非即为 11111010
        //这个二进制换算成十进制即为-6
        //注意！！ 这里的取非用的符号为~ i ~i，不是逻辑取反的符号！
        
        //左移 右移
        byte I = 6;
        //6的二进制是110
        System.out.println(Integer.toBinaryString(I));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(I<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(I>>1);
        /*带符号右移
        	对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        	对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1
        	无符号右移>>>
        	如果是一个负数，那么对应的二进制的第一位是1
        	无符号右移>>>会把第一位的1也向右移动，导致移动后，第一位变成0
        	这样就会使得负数在无符号右移后，得到一个正数
        	负数二进制为其绝对值的二进制+1 10=00001010 取反=11110101 +1=11110110 （二进制逢二进一！）
        	-10 二进制11110110 带符号右移一位 前边补1 变为 11111011=-5
        	-10无符号右移 11110110 011111011=123
        	*/
        
        //赋值运算符
        int Z = 5+5; //从右向左赋值
         	Z+=5;//Z+=5 等同于Z=Z+5
        //三元操作符 等同于if else
        boolean X = 20 < 45 ? true : false;
        boolean z;
        if (20<45)
        	z = true;
        else 
        	z = false;
        
        //圆括号，可提高运算优先级
        //a+b*c (a+b)*c 优先级改变
        //运算符优先级
        //增减量运算、算术运算、比较运算、逻辑运算、赋值运算
        //如果两个优先级一样的运算，则左边的表达式优先级更高
        
	}

}
