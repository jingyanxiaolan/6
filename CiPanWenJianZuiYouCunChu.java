//4-4磁盘文件最优存储问题
import java.util.Arrays;

import java.util.Scanner;


public class CiPanWenJianZuiYouCunChu {

 
   private static int n;
   
 private static int[] p;
  
  private static int[] x;

  
  public static void main(String[] args){
        
Scanner input = new Scanner(System.in);

  
      while (true){
           
      n = input.nextInt();

    //输入文件个数：5  
      p = new int[n];
           
      x = new int[n];


            for(int i=0; i<n; i++)
 //i=0,i<5,i++
               p[i] = input.nextInt();

 //输入p的值：33 55 22 11 9
           double result = greedy();

 
           System.out.println(String.format("%.6f", result));
 
       }
    }

   
 private static double greedy(){
   
     Arrays.sort(p);
 //将p从小到大排：9 11 22 33 55
       int k = (n-1)/2; 
//2
        x[k] = p[n-1];
 //x[2]=p[4]=55
       for(int i=k+1; i<n; i++)
 //i=3,i<5,i++
           x[i] = p[n-2*(i-k)];
// x[3]=p[2]=22
       for(int i=k-1; i>=0; i--)
//i=1,i>=0,i--
            x[i] = p[n-2*(k-i)-1];
 //x[1]=p[1]=11
       double m=0,t=0;
 
       for(int i=0; i<n; i++){
  
          m += p[i];
//m=9+11+22+33+55=130
            for(int j=i+1; j<n; j++)

                t += x[i]*x[j]*(j-i);

        }
        t = t/m/m;

 
       return t;
    }
}
