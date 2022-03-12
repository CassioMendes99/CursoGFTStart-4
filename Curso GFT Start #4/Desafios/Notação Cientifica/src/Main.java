import java.util.Scanner;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Escreva aqui o seu código


        double X = leitor.nextDouble();
        System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
    }
}
