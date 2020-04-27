package view;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

import model.Dimensionn;
import view.info.BoardUIInfo;

public class BoardUI extends JPanel {
	private JPanel[][] files;
	private MouseAdapter mouseAdapter;
	
	/**
	 * Create the panel.
	 */
	public BoardUI(Dimensionn dimension, MouseAdapter mouseAdapter, BoardUIInfo boardUIInfo) {
		this.mouseAdapter= mouseAdapter;
		int width=dimension.getWidth();
		int height=dimension.getHeight();
		files= new JPanel[width][height];
		setLayout(new GridLayout(width, height,0,0));
		updateBoardUI(boardUIInfo);
	}
	public void updateBoardUI(BoardUIInfo boardUIInfo) {
		removeAll();
		boardUIInfo.getFiles(files);
		for (int i = 0; i < files.length; i++) {
			for (int j = 0; j < files[i].length; j++) {
				JPanel square = files[i][j];
				square.addMouseListener(mouseAdapter);
				add(square);
			}
		}
		revalidate();
	}

}
