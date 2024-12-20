package com.mycompany.app.Patterns.Factory;

import com.mycompany.app.Patterns.Factory.Interface.Pessoa;

public class PessoaFactory {
    public Pessoa criarPessoa(String tipo) {
        if (tipo.equals("autor")) {
            return new Autor();
        } else if (tipo.equals("usuario")) {
            return new Usuario();
        }
        return null;
    }
}
