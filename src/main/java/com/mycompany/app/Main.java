package com.mycompany.app;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Autor autor1 = new Autor("George Orwell", "Britânico");
		Livro livro1 = new Livro("1984", autor1, "Ficção Distópica", 12);
		Livro[] livros = {livro1};
		autor1.setLivros(livros);

		Usuario usuario1 = new Usuario("Henrique Lelles", 16);
		Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, new Date(), new Date());
		livro1.setDisponibilidade(false);
		Emprestimo[] emprestimos = {emprestimo1};
		usuario1.setHistoricoEmprestimos(emprestimos);

		livro1.validarDisponibilidade();
		System.out.println("Livro: " + emprestimo1.getLivro().getTitulo());
		System.out.println("Autor: " + emprestimo1.getLivro().getAutor().getNome());
		System.out.println("Gênero: " + emprestimo1.getLivro().getGenero());
		System.out.println("Usuário: " + emprestimo1.getUsuario().getNome());
		System.out.println("Idade: " + emprestimo1.getUsuario().getIdade());
		System.out.println("Data de Retirada: " + emprestimo1.getDataRetirada());
		System.out.println("Data de Devolução: " + emprestimo1.getDataDevolucao());
	}
}
