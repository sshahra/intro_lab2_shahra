package lab_work;

import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      if (n>0){
      n=n+1;
      int [] sum= new int[n];
      sum[0]=0;
      sum[1]=1;
      int temp=0;
      for(int i=1;i<n-1;i++){
         sum[i+1]=sum[i]+sum[i-1];
      }
          
   return sum[n-1];
   }
   else if(n==0)
   { return 0;}
   else{return -1;}
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
