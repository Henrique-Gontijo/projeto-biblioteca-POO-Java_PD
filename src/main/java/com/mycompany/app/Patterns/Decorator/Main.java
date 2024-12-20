package com.mycompany.app.Patterns.Decorator;

import com.mycompany.app.Patterns.Decorator.Interface.Publicavel;

public class Main {
    public static void main(String[] args) {
        // Uso do padrão Decorator
        Publicavel autor = new Autor();
        Publicavel usuarioDecorado = new UsuarioDecorator(autor);
        usuarioDecorado.publicar();
    }
}
