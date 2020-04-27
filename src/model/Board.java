package model;

import java.util.HashMap;

public class Board {
	private Dimensionn dimension;
	private Matrix<Coordinate, Square> squares;

	public Board(Dimensionn dimension) {
		super();
		this.dimension = dimension;

		squares = new Matrix<Coordinate, Square>(dimension.getWidth(), dimension.getHeight());
	}

	public Square getFile(Coordinate coordinate) {
		return squares.getElement(coordinate);
	}

	public void insert(model.Square square, Coordinate coordinate) {
		squares.setElement(coordinate, square);
	}

	public void insert(Battalion battalion, Coordinate coordinate) {
		squares.setElement(coordinate, battalion);
		
	}
}
