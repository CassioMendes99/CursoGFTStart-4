package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(5,2);
        Calculadora.multiplicacao(4,4);
        Calculadora.divisao(6,3);

        // Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(5);

        // Empréstimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
