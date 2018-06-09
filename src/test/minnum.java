package test;

public class minnum {

	public static void main(String[] args) {
		int[] a = new int[10];
        int minNum;     //最小数
        //用循环产生随机数
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println("数组中的各个随机数是:");
        //假设第一个数为最小值
        minNum = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            //如果最小值大于数组遍历到的值就把这个值赋给MinNum。
            if(minNum > a[i]){
                minNum = a[i];
            }
        }
         
        System.out.println("最小数为:"+minNum);
	}

}
