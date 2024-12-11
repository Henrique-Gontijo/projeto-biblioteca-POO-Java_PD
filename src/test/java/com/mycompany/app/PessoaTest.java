package com.mycompany.app;

import org.junit;
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