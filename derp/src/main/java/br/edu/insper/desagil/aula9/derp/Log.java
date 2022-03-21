package br.edu.insper.desagil.aula9.derp;

import java.util.ArrayList;
import java.util.List;

public class Log {
	private List<String> entries;

	public Log() {
		this.entries = new ArrayList<>();
	}

	public boolean contains(String entry) {
		return entries.contains(entry);
	}

	public int size() {
		return entries.size();
	}

	public void add(String entry) {
		entries.add(entry);
	}
}
