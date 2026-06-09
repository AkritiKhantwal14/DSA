//Find Ncr & Npr

import java.util.Scanner;
public class permutaion_combination {

    static int fact(int n){
        int f=1;
        for(int i=1; i<n ;i++){
            f = f*i;

        }
        return f;
    }
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter n");
        int n= sc.nextInt();
        
        System.out.println("enter r");
        int r= sc.nextInt();

        int ncr= fact(n)/(fact(r)*fact(n-r));
        int npr= fact(n)/fact(n-r);


        System.out.println("Combinations" + ncr);
        System.out.println("permutations" + npr);
    }   




    
}
