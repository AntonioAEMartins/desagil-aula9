package br.edu.insper.desagil.aula9.derp;

public class InterfaceGrafica implements Gerenciador {
	private Log log;

	public InterfaceGrafica(Log log) {
		this.log = log;
	}

	public void show(Report report) {
		/*
		 * Imagine que aqui há um código que atualiza a interface gráfica.
		 */
		log.add("Interface mostrou " + report.getTitle());
	}

	@Override
	public void manipulador(Report report) {
		// TODO Auto-generated method stub
		
	}
}
