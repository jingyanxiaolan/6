//4-7多处最优服务次序问题
import java.util.Arrays;

import java.util.Scanner;


public class DuoChuZuiYouFuWuCiXu {

 
   private static int n,s;
  //定义了变量n，s，n代表顾客数量,s代表可提供顾客需要的服务有多少处
 private static int[] time;
   //定义了一个time数组
 private static int[] sum,total;

 //定义了变量sum和total，
   public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);

  
      while (true){
           
 n = input.nextInt();
 //从输入n的值：10
           s = input.nextInt();

  //从键盘输入s的值：2
          time = new int[n];
      //开辟大小为n的int*型数组，time等于数组首地址     
 sum = new int[s];
 //开辟大小为s的int*型数组，sum等于数组首地址  
           total = new int[s];

 //开辟大小为s的int*型数组，total等于数组首地址  
           for(int i=0; i<n; i++)
 
               time[i] = input.nextInt();

// 输入time[i]的值：56 12 1 99 1000 234 33 56 99 812          
Arrays.sort(time);

 //将时间从小到大排：1 12 33 55 56 99 99 234 812 1000
           double result = greedy();

  
          System.out.println(String.format("%.4f", result));
  //输出结果
      }
    }

   
 private static double greedy(){
   
     int i=0,j=0;
   
     while(i < n){
  //i<10       
   sum[j] += time[i];
//sum=
            total[j] += sum[j];
   
         i++;j++;
  
          if(j == s) j = 0;
 
       }
       
 double totalTime = 0;
  
      for(i=0; i<s; i++)
 
           totalTime += total[i];
 
       totalTime /= n;

  //求最小平均等待时间 
     return totalTime;
   
 }
}

