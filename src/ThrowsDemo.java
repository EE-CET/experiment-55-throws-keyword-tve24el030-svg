import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    
   
    static void check(int n)throws IOException{
        if(n<0){
            throw new IOException();
        }
        else{
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        try {
            check(a);
        } catch (IOException e) {
            System.out.println("Caught: IO Exception");
        }
    }
}
