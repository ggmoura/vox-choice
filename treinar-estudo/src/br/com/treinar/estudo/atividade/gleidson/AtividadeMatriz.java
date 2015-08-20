package br.com.treinar.estudo.atividade.gleidson;

public class AtividadeMatriz {

	public static void main(String[] args) {
		Integer[][] matriz = new Integer[3][];
		
		matriz[0] = new Integer[5];
		matriz[1] = new Integer[3];
		matriz[2] = new Integer[10];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i + (j + 1);
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
