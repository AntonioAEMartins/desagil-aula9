package br.edu.insper.desagil.aula9.derp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ManagerTest {
	@Test
	public void test() {
		Log log = new Log();
		BancoDeDados bd = new BancoDeDados(log);
		InterfaceGrafica gui = new InterfaceGrafica(log);
		ServidorOnline api = new ServidorOnline(log);
		Manager manager = new Manager(bd, gui, api);
		Report report = new Report("Balanço Financeiro");

		manager.finish(report);

		assertEquals(3, log.size());
		assertTrue(log.contains("Banco de dados salvou Balanço Financeiro"));
		assertTrue(log.contains("Interface mostrou Balanço Financeiro"));
		assertTrue(log.contains("Servidor recebeu Balanço Financeiro"));
	}
}
