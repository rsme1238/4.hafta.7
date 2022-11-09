
package pkg4.hafta.pkg7;

import java.util.Scanner;

public class Hafta7 {

    public static void main(String[] args) {
          Scanner input = new Scanner (System.in); 
         
        System.out.println("Enter here the N number= ");
        int n = input.nextInt();
        int i=1;
        
        int t1=0, t2=0, t3=0;
        
         for(i=1; i<=n;i++)
             t1=t1 + 1;
             
              for(i=1; i<=n;i+=2)
             t2=t2 + 1;
              
              
                for(i=2; i<=n;i+=2)
             t3=t3 + 1;
              

        
         
         System.out.println("/n1 den " +n+ "'e kadar sayilarin toplami: " +t1);
         System.out.println("1 den "+n+"'e kadar tek sayilarin toplami: " +t2);
         System.out.println("1 den "+n+"'e kadar cift sayilarin toplami: " +t3);
            
    }
    
}
            
