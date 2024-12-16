package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testGetNome() {
        //  Cria uma intância da classe Pessoa
        Pessoa pessoa = new Pessoa();

        //  Atribuir nome para a pessoa
        pessoa.setNome("Henrique");

        // Verifica se o nome retornado é o mesmo que foi definido
        assertEquals("Henrique", pessoa.getNome());
    }
    @Test
    public void testSetNome() {
        // Cria uma intância da classe pessoa
        Pessoa pessoa = new Pessoa();

        // Define um nome para a pessoa
        pessoa.setName("Henrique");

        // Verifica se o nome que foi retornado é o mesmo que foi definido
        assertEquals("Henrique", pessoa.getNome);
    }
    @Test
    public void testGetLivros() {
        //  Cria uma intância da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Define uma lista de livros para a pessoa
        Livro[] livros = new Livro;
        livros = new Livro("Livro1");
        livros = new Livro("Livro2");
        pessoa.setLivros(livros);

        // Verifica se a lista de livros retornada é a mesma que foi definida
        assertArrayEquals(livros, pessoa.getLivros());
    }
}
//  Isntância de pessoa de pessoa com um nome


//  getNome() => Retorna o nome da pessoa 
//  comparar com o nome passado com setName()

//  setNome() => Atribui um valor para a propriedade nome
//  Comparar com o nome que vem do getNome() é o mesmo que passamos em setNome()

//  getLivros() => Retorna uma lista de livros atribuidas a uma pessoa
//  Comparar se a lista retornada é a mesma que passamos para setLivros()

//  setLivros() => Atribui uma lista de livros a uma pessoa
//  Comparar se o valor do getLivros() é o mesmo de passamos em setLivros()
