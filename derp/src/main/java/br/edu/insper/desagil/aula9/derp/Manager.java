package br.edu.insper.desagil.aula9.derp;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<Gerenciador> manipuladores;
	
	public Manager() {
		// TODO Auto-generated constructor stub
		this.manipuladores = new ArrayList<>();
	}

	public void addGerenciador(Gerenciador manipulador) {
		this.manipuladores.add(manipulador);
	}
	
	public void finish (Report report) {
		for (Gerenciador manipula : this.manipuladores) {
			manipula.manipulador(report);
		}
	}
}
