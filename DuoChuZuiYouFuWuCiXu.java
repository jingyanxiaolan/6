//4-7�ദ���ŷ����������
import java.util.Arrays;

import java.util.Scanner;


public class DuoChuZuiYouFuWuCiXu {

 
   private static int n,s;
  //�����˱���n��s��n����˿�����,s������ṩ�˿���Ҫ�ķ����ж��ٴ�
 private static int[] time;
   //������һ��time����
 private static int[] sum,total;

 //�����˱���sum��total��
   public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);

  
      while (true){
           
 n = input.nextInt();
 //������n��ֵ��10
           s = input.nextInt();

  //�Ӽ�������s��ֵ��2
          time = new int[n];
      //���ٴ�СΪn��int*�����飬time���������׵�ַ     
 sum = new int[s];
 //���ٴ�СΪs��int*�����飬sum���������׵�ַ  
           total = new int[s];

 //���ٴ�СΪs��int*�����飬total���������׵�ַ  
           for(int i=0; i<n; i++)
 
               time[i] = input.nextInt();

// ����time[i]��ֵ��56 12 1 99 1000 234 33 56 99 812          
Arrays.sort(time);

 //��ʱ���С�����ţ�1 12 33 55 56 99 99 234 812 1000
           double result = greedy();

  
          System.out.println(String.format("%.4f", result));
  //������
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

  //����Сƽ���ȴ�ʱ�� 
     return totalTime;
   
 }
}

