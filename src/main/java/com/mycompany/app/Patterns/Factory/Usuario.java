package com.mycompany.app.Patterns.Factory;

import com.mycompany.app.Patterns.Factory.Interface.Pessoa;

public class Usuario implements Pessoa{
    public void saudacao() {
        System.out.println("Olá, sou um usuário!");
    }
}
