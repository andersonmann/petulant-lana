package pucrs.alpro3.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UndirectedGraphMatrix implements UndirectedGraph {

	private boolean[][] matrix;
	private List<String> names;

	public UndirectedGraphMatrix() {
		matrix = new boolean[5][5];
		names = new ArrayList<String>();
	}

	@Override
	public void addVertice(String vertice) {
		if (vertice == null)
			throw new IllegalArgumentException("O vertice nao pode ser null");

		if (vertice.trim().isEmpty())
			throw new IllegalArgumentException("O vertice nao pode ser vazio");
			
		if (names.contains(vertice))
			throw new IllegalArgumentException("O vertice ja se encontra cadastrado: " + vertice);
		
		names.add(vertice);
	}

	@Override
	public void addEdge(String strOrig, String strDest) {
		int posOrig = names.indexOf(strOrig);
		int posDest = names.indexOf(strDest);
		matrix[posOrig][posDest] = true;
	}

	@Override
	public int getDegree(String vertice) {
		return getAllAdjacents(vertice).size();
	}

	@Override
	public ArrayList<String> getAllAdjacents(String vertice) {
		ArrayList<String> r = new ArrayList<>();
		// TODO consultar posicao do vertice
		// TODO percorrer a linha da posi��o do vertice
		// TODO colocar o nome de cada vertice na lista
		// TODO retornar a lista
		return r;
	}

	@Override
	public String toString() {
		String r = "";
		r += names.toString();
		for (int i = 0; i < matrix.length; i++) {
			r += "\n" + Arrays.toString(matrix[i]);
		}
		return r;
	}

}
