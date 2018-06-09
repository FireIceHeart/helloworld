package test;
import java.util.Arrays;
public class 数组排序 {

	public static void main(String[] args) {
		 int a [] = new int[]{18,62,68,82,65,9};
		 //选择法
		 for (int j = 0; j < a.length-1; j++) {
	            for (int i = j+1; i < a.length; i++) {
	                if(a[i]<a[j]){  
	                    int temp = a[j];
	                    a[j] = a[i];
	                    a[i] = temp;
	                }
	            }
	        }
	         
	        //把内容打印出来
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println(" ");  

	        //冒泡法
	        for (int j = 0; j < a.length; j++) {
	            for (int i = 0; i < a.length-j-1; i++) {
	                if(a[i]>a[i+1]){  
	                    int temp = a[i];
	                    a[i] = a[i+1];
	                    a[i+1] = temp;
	                }
	            }
	        }
	          
	        //把内容打印出来
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println(" ");    	
	        	
	       //使用Arrays方法排序 
	        System.out.println("排序之前 :");
	        System.out.println(Arrays.toString(a));
	        Arrays.sort(a);
	        System.out.println("排序之后:");
	        System.out.println(Arrays.toString(a));
	}

}
