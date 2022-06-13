package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();// significa que o lugar na memoria, para guardar a lista, deve-se
														// manter o mesmo

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

//metodo utilizado para converter o objeto em string
	public String toString() {
		return nome;
	}

}
