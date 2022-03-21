package br.edu.insper.desagil.aula9.derp;

public class BancoDeDados implements Gerenciador{
	private Log log;

	public BancoDeDados(Log log) {
		this.log = log;
	}

	public void save(Report report) {
		/*
		 * Imagine que aqui há um código que envia requisições para um banco de dados.
		 */
		log.add("Banco de dados salvou " + report.getTitle());
	}

	@Override
	public void manipulador(Report report) {
		// TODO Auto-generated method stub
		
	}
}
