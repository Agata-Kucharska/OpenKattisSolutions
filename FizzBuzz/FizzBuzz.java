import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        int[] arr = {s.nextInt(), s.nextInt(), s.nextInt()}; 
        fizzBuzz(arr[0],arr[1],arr[2]);
    }
		
    public static void fizzBuzz (int x, int y, int n){
		for (int i=1; i<=n; i++){
            if (i%x==0 & i%y==0)
                System.out.println("FizzBuzz");
            else if(i%x==0) 
                System.out.println("Fizz");
        
            else if(i%y==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }            
}