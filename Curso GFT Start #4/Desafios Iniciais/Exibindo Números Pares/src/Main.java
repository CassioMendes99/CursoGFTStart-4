import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {
        Scanner leitor=new Scanner(System.in);
        int n,i=2;

        System.out.println("Digite número:");
        n=leitor.nextInt();

         do {
            System.out.println(i);
             i=i+2;
         }while (n>=i);
    }
}
