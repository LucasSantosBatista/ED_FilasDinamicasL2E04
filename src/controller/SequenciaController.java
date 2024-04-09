package controller;

import model.FilaGeneric;

public class SequenciaController {
	public FilaGeneric<Integer> inicializaFila(FilaGeneric<Integer> f) {

		f.insert(3);
		f.insert(10);
		f.insert(1);
		f.insert(20);
		f.insert(18);
		f.insert(7);
		f.insert(4);
		f.insert(16);
		f.insert(2);
		f.insert(9);
		f.insert(12);
		f.insert(14);

		return f;

	}
}
