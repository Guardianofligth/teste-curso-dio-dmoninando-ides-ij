package br.vom.dio;

import br.vom.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livros livro1 = new Livros ("3" , 300);
        System.out.println(livro1);
        /* int a = 5;
         int b = 2;
        System.out.println("hello wordl!!" + (a+b));*/


    }
}
class Livros {

    private String nome;
    private Integer numpaginas;

    public Livros(String nome, Integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(Integer numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numpaginas=" + numpaginas +
                '}';
    }
}