package com.mycompany.app.Patterns.Decorator;

import com.mycompany.app.Patterns.Decorator.Interface.Publicavel;

public class UsuarioDecorator implements Publicavel {
    private Publicavel usuario;

    public UsuarioDecorator(Publicavel usuario) {
        this.usuario = usuario;
    }

    public void publicar() {
        usuario.publicar();
        System.out.println("Publicando como usuário...");
    }
    
}
