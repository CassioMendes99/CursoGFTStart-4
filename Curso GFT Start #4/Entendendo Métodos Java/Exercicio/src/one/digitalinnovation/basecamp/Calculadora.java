package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void soma(double n1,double n2){
        double resultado=n1+n2;

        System.out.println("A soma de "+ n1 + " e "+ n2 +" é "+ resultado);
    }
    public static void subtracao(double n1,double n2){
        double resultado=n1-n2;

        System.out.println("A subtração de "+ n1 + " e "+ n2 +" é "+ resultado);
    }
    public static void multiplicacao(double n1,double n2){
        double resultado=n1*n2;

        System.out.println("A multiplicação de "+ n1 + " e "+ n2 +" é "+ resultado);
    }
    public static void divisao(double n1,double n2){
        double resultado=n1/n2;

        System.out.println("A divisão de "+ n1 + " e "+ n2 +" é "+ resultado);
    }
}
