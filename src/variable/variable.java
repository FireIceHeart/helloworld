package variable;

public class variable {

	public static void main(String[] args) {
		int year = 1949; 
		/*int 是数据类型，表示是整数 
		 * year 是一个标识符
		 * = 是赋值操作符
		 * 1949 是一个数字类型的值
		 * ; 表示该行结束
		*/
		//基本变量：（给基本变量赋值叫做字面值）
		//整数数据类型
		byte b = 1; //-128-127 2^8
		short s = 200;//-32,768-32,767 2^16
		int i = 300;//2,147,483,648-2,147,483,647 2^32
		long l = 400L;//2^64
		/*如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误*/
		//byte b2 = 200;
		//字符型
		char c = '中';
	      //char 只能存放一个字符，超过一个字符就会产生编译错误
	      //char c2 = '中国'; //报错
	      //char c3 = 'ab'; //报错
		// \表示转义
		char tab = '\t';//制表符
		char carriageReturn = '\r'; //回车
	    char newLine = '\n'; //换行
	    char doubleQuote = '\"'; //双引号
	    char singleQuote = '\''; //单引号
	    char backslash = '\\'; //反斜杠
	    //浮点型
	    //float/double 32位与64位 小数默认为double类型
	     double d = 123.45;
	     //float f = 54.321;
	     /* float f = 54.321会出现编译错误，因为54.321的默认类型是 double，
	      * 其类型 长度为64，超过了float的长度32 
			在数字后面加一个字母f，直接把该数字声明成float类型 */
	     float f2 = 54.321f;
	   //布尔型
	     boolean b1 = true;
	     boolean b2 = false;
	  // 虽然布尔型真正存放的数据是0(false) 1(true)
	  // 但是，不能直接使用0 1 进行赋值
	  //String String类型其实并不是基本类型
	     String str = "hello";
	 //练习
	     double p = 3.14;
	     float m = 2.769343f;
	     int D = 365;
	     byte t = 12;
	     char e = '吃';
	     boolean fa = false;
	     String ud = "不可描述";
	     
	 //类型转换
	     char A = 'A';
	     short S = 80;
	     A = (char) S;//char A = 80 对应Unicode第80位，输出为字母P
	   //虽然short和char都是16位的，长度是一样的
	   //但是彼此之间，依然需要进行强制转换 S = A报错
	     System.out.println(A);
	     long L = 50;
	     int I = 50;
	     L = I;
	   //int比较小，要放进比较大的long,随便怎么样，都放的进去
	     byte B = 5;
	        int i1 = 10;
	        int i2 = 300;
	          
	        B = (byte) i1;
	        //因为i1的值是在byte范围之内，所以即便进行强制转换
	        //最后得到的值，也是10
	        System.out.println(B);
	          
	        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
	        //i2的值是300，其对应的二进制数是 100101100
	        //按照byte的长度8位进行截取后，其值为 00101100 即44
	        B =(byte) i2;
	        System.out.println(B);
	        
	}
}
