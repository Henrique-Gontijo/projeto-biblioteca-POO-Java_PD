package com.mycompany.app.Patterns.Factory;

import com.mycompany.app.Patterns.Factory.Interface.Pessoa;

public class Autor implements Pessoa {
    public void saudacao() {
        System.out.println("Olá, sou um autor!");
    }
}
