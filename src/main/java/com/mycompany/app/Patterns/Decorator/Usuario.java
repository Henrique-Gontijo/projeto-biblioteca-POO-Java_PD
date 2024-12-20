package com.mycompany.app.Patterns.Decorator;

import com.mycompany.app.Patterns.Decorator.Interface.Publicavel;

public class Usuario implements Publicavel {
	public void publicar() {
		System.out.println("Usuário publicando...");
	}
}
