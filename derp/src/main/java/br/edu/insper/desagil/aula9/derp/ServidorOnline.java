package br.edu.insper.desagil.aula9.derp;

public class ServidorOnline {
	private Log log;

	public ServidorOnline(Log log) {
		this.log = log;
	}

	public void notify(Report report) {
		/*
		 * Imagine que aqui há um código que envia requisições para um API online.
		 */
		log.add("Servidor recebeu " + report.getTitle());
	}
}
