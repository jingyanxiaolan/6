//4-1会场安排问题
import java.util.Arrays;

import java.util.Scanner;


public class HuiChangAnPaiWenTi {
  
public static void main(String[] args) {
  
      Scanner sr = new Scanner(System.in);
 
       int k = sr.nextInt();
   //k代表待安排的活动个数  5   
int a[] = new int [k];
   
     int b[] = new int [k];
 
       for(int i=0;i<k;i++) {
        
    a[i]=sr.nextInt();
         
   b[i]=sr.nextInt();
        }
    
    Arrays.sort(a);
  //将数组a从小到大排  :1 12 25  27 36
  Arrays.sort(b);
   //将数组b按从小到大排  :23 28 35 50 80
  Greedy(k,a,b);
  //检测a和b的数据是否相容a= 1 12 25 27 36 b=23 28 35 80 50
 }
   
 private static void Greedy(int k,int start[],int end[]){
       
 int j=0;
       
 int count = 0;
    //统计最少会场数    
 for (int i=0;i<k;i++){
      
      if (start[i]<end[j]){
      //如果开始时间i小于结束时间j    
   count++;
          
  }else{
                j++;
    
        }
        }
           
 System.out.println(count);
   }
}
