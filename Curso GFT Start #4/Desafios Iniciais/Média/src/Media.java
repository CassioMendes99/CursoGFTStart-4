import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;
        System.out.println("Digite 1º número:");
        A = sc.nextDouble();
        System.out.println("Digite 2º número:");
        B = sc.nextDouble();

        media = (    A * 3.5 +     B* 7.5)/11;

        System.out.printf("MEDIA = %.5f",   media );
        System.out.println();
    }
}
