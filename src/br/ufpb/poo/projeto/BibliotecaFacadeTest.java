package br.ufpb.poo.projeto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaFacadeTest {
	
	private BibliotecaFacade biblioteca;

	@Before
	public void iniciar(){
		biblioteca = new BibliotecaFacade(); 
	}
	
	// GerenteAluno - Rozimar Rodrigues
	@Test
	public void adicionarAluno() {
		Aluno aluno = new Aluno();
		biblioteca.adicionaAluno(aluno);
		assertEquals(1,biblioteca.quantidadeAlunos());
	}
	
	@Test(expected = AlunoJaCadastradoException.class)
	public void adicionaAlunoNovamente(){
		Aluno aluno = new Aluno();
		biblioteca.adicionaAluno(aluno);
		biblioteca.adicionaAluno(aluno);
	}
	
	@Test
	public void adicionaAlunoDiferente() {
		//TODO
	}
	
	// GerenteProfessor - Emanuel Rair
	/*
	 * TODO testes para o GerenteProfessor
	 */
	
	// GerenteFuncionario - Mailton Fernandes
	/*
	 * TODO testes para o GerenteFuncionario
	 */
}