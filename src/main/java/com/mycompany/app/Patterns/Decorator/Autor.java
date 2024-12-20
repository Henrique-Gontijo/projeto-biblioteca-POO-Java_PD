package com.mycompany.app.Patterns.Decorator;
import com.mycompany.app.Patterns.Decorator.Interface.Publicavel;

public class Autor implements Publicavel {
	public void publicar() {
		System.out.println("Publicando como autor...");
	}
}
