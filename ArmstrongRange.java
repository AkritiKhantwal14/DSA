//Armstrong in a Range

import java.util.Scanner;
public class ArmstrongRange{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter start");
        int start= sc.nextInt();
        
        System.out.println("enter end");
        int end= sc.nextInt();
        
        System.out.println("Armstrong numbers in range");

        for (int num = start; num<= end ; num++){
           
            int digits=0;
            int sum=0;
           
            for (int i=num ; i>0 ;i=i/10){
                digits++;
            }
           
            for (int i=num ; i>0 ;i=i/10){
                int y= i%10;
                sum = sum + (int)Math.pow(y, digits);

            }

            if(sum==num){
                System.out.println(num);
            }
        }      
    }    
}
