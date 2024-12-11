package com.mycompany.app;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Autor autor = new Autor("George Orwell", "Britânico");
		Livro livro = new Livro("1984", autor, "Ficção Distópica", 12, true);
		Livro[] livros = {livro};
		autor.setLivros(livros);

		Usuario usuario = new Usuario("Henrique Lelles", 16);
		Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date(), new Date());
		livro.setDisponibilidade(false);
		Emprestimo[] emprestimos = {emprestimo};
		usuario.setHistoricoEmprestimos(emprestimos);

		livro.validarDisponibilidade();
		System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
		System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
		System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
		System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
		System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
		System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
		System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
	}
}
