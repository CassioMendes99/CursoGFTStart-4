package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        br.com.dio.model.Gato gato = new br.com.dio.model.Gato("Cat", "Preto",4);
        System.out.println(gato);

        Livro livro1=new Livro("Código Da Vinci",536);
        System.out.println(livro1);
    }
}

class Livro{
    private String nome;
    private int num_paginas;

    public Livro(String nome, int num_paginas) {
        this.nome = nome;
        this.num_paginas = num_paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", num_paginas=" + num_paginas +
                '}';
    }
}
