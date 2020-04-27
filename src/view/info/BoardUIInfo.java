package view.info;

import javax.swing.JPanel;

import model.Board;
import model.Coordinate;
import view.Generator;
import view.WhiteFile;

public class BoardUIInfo {
	private Board board;
	
	public BoardUIInfo(Board board) {
		super();
		this.board = board;
	}

	public void getFiles(JPanel[][] files) {
		for (int i = 0; i < files.length; i++) {
			for (int j = 0; j < files[i].length; j++) {
				JPanel fileInfo= Generator.getFile(board, new Coordinate(i, j));
				
				files[i][j]= fileInfo;
			}
		}
		
	}
	
}
