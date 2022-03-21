package br.edu.insper.desagil.aula9.derp;

public class Manager {
	private BancoDeDados bd;
	private InterfaceGrafica gui;
	private ServidorOnline api;

	public Manager(BancoDeDados bd, InterfaceGrafica gui, ServidorOnline api) {
		this.bd = bd;
		this.gui = gui;
		this.api = api;
	}

	public void finish(Report report) {
		bd.save(report);
		gui.show(report);
		api.notify(report);
	}
}
