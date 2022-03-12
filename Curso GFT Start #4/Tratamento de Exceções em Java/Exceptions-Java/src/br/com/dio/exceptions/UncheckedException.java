package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continuelooping=true;
        do {
            String a=JOptionPane.showInputDialog("Numerador: ");
            String b=JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado=dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+ resultado);
                continuelooping=false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null , "Entrada Inválida, informe um número inteiro!"+ e.getMessage());
                //e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null , "Impossivel dividir um número por 0"+ e.getMessage());
                //e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally!");
            }
        }while(continuelooping);

        System.out.println("O Código continua...");
    }

    public static int dividir(int a, int b){return a/b;}
}
