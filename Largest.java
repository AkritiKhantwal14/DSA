//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class Largest {
    public static void main(String [] args){
        int n;
        int max=0;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nnumbers");
        System.out.println("0 to exit");
        n= sc.nextInt();
        

        while(n!=0){
            if(n> max){
                max = n;
                
            }
            n= sc.nextInt();

        }
        System.out.println(max);
    }
}
