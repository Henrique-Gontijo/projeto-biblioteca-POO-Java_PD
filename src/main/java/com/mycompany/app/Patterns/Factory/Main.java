package com.mycompany.app.Patterns.Factory;

import com.mycompany.app.Patterns.Factory.Interface.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Uso do padrão Fábrica
        PessoaFactory factory = new PessoaFactory();
        Pessoa pessoa = factory.criarPessoa("autor");
        pessoa.saudacao();
    }
}
