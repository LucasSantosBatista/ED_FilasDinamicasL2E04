package view;

import controller.SequenciaController;
import model.FilaGeneric;

public class Main {
	public static void main(String[] args) {
		FilaGeneric<Integer> f = new FilaGeneric<>();
		SequenciaController ctrl = new SequenciaController();
		int[] vetor = new int[7];

		f = ctrl.inicializaFila(f);
		try {
			f.list();

			vetor[0] = f.remove();
			f.insert(f.remove());
			f.insert(f.remove());
			vetor[1] = f.remove();
			f.insert(f.remove());
			vetor[4] = f.remove();
			vetor[3] = f.remove();
			vetor[2] = f.remove();
			f.insert(f.remove());
			f.insert(f.remove());
			vetor[6] = f.remove();
			vetor[5] = f.remove();

			for (int v : vetor) {
				System.out.println(v);
			}

			vetor[0] = f.remove(); // 10
			vetor[1] = f.remove(); // 1
			vetor[2] = f.remove();// 18
			vetor[3] = f.remove();// 2
			vetor[4] = f.remove();// 9

			f.insert(vetor[1]);
			f.insert(vetor[0]);
			f.insert(vetor[3]);
			f.insert(vetor[4]);
			f.insert(vetor[2]);

			f.list();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}