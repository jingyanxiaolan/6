//4-1�᳡��������
import java.util.Arrays;

import java.util.Scanner;


public class HuiChangAnPaiWenTi {
  
public static void main(String[] args) {
  
      Scanner sr = new Scanner(System.in);
 
       int k = sr.nextInt();
   //k��������ŵĻ����  5   
int a[] = new int [k];
   
     int b[] = new int [k];
 
       for(int i=0;i<k;i++) {
        
    a[i]=sr.nextInt();
         
   b[i]=sr.nextInt();
        }
    
    Arrays.sort(a);
  //������a��С������  :1 12 25  27 36
  Arrays.sort(b);
   //������b����С������  :23 28 35 50 80
  Greedy(k,a,b);
  //���a��b�������Ƿ�����a= 1 12 25 27 36 b=23 28 35 80 50
 }
   
 private static void Greedy(int k,int start[],int end[]){
       
 int j=0;
       
 int count = 0;
    //ͳ�����ٻ᳡��    
 for (int i=0;i<k;i++){
      
      if (start[i]<end[j]){
      //�����ʼʱ��iС�ڽ���ʱ��j    
   count++;
          
  }else{
                j++;
    
        }
        }
           
 System.out.println(count);
   }
}
