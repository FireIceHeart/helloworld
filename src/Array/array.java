package Array;
import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		//数组是一个固定长度的，包含了相同类型数据的 容器
		/* int[] a; 声明了一个数组变量。
		[]表示该变量是一个数组
		int 表示数组里的每一个元素都是一个整数
		a 是变量名
		但是，仅仅是这一句声明，不会创建数组
		有时候也会写成int a[]; 没有任何区别，就是你看哪种顺眼的问题*/
		int a[];
		//声明数组
		//创建一个长度是5的数组，并且使用引用a指向该数组
		a = new int[5];
		int b[] = new int[5];
		//访问数组,赋值
		a[0] = 1;//下标0，代表数组的第一个数
		a[1] = 2;
		a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a.length); //打印数组的长度
        a[4]=100; //下标4，实质上是“第5个”，既最后一个
        //a[5]=101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
        //分配空间同时赋值
      //写法一： 分配空间同时赋值
        int[] c = new int[]{100,102,444,836,3236};
 
        //写法二： 省略了new int[],效果一样
        int[] d = {100,102,444,836,3236};
         
        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
        //int[] f = new int[3]{100,102,444,836,3236};
        //二维数组，第一个下标是行，第二个下标是列
      //初始化二维数组，
        int[][] Q = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
       Q[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间
           
        //只分配了二维数组
        int[][] W = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        W[0]  =new int[3]; //必须事先分配长度，才可以访问
       W[0][2] = 5;
         
        //指定内容的同时，分配空间
        int[][] E = new int[][]{//E.length返回的是行数 E[0].length返回的是第一行的列数，以此类推
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };
        
        //转化为字符串
        String content = Arrays.toString(a);
        System.out.println(content);
        
        //搜索元素出现位置
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 100出现的位置:"+Arrays.binarySearch(a, 100));
        
        //判断数组是否相同
        System.out.println(Arrays.equals(a, c));
        
        //用某个数填充数组
        Arrays.fill(a, 5);
	}

}
