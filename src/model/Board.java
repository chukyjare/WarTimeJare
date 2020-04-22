package model;

import java.util.HashMap;

public class Board {
	private int width, height;
	private Matrix<Coordinate, Square> squares;
	
	public Board(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		squares = new Matrix<Coordinate, Square>(width, height);
	}
	
}
